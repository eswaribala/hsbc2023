import React, {useEffect, useRef, useState} from "react";
import {InputText} from 'primereact/inputtext'
import { Fieldset } from 'primereact/fieldset';
import { InputTextarea } from 'primereact/inputtextarea';
import { Button } from 'primereact/button';
import { Calendar } from 'primereact/calendar';
import { Dropdown } from 'primereact/dropdown';
import './savingsaccount.css'
import {validate} from "./validator";
import axios from "axios";
import { Messages } from 'primereact/messages';
import {useMountEffect} from "primereact/hooks";
import {fetchCountries} from "./fetchcountries";
import { Accordion, AccordionTab } from 'primereact/accordion';
import LoanAgainstProperty from "../LoanAgainstProperty/loanagainstproperty";

let restAPIUrl="http://localhost:7070/customers/v1.0/"


//functional approach
//React Hook 16.8
function SavingsAccount(props) {

    //destructured object
    const{firstName:propsFirstName, lastName:propsLastName,
    email:propsEmail,dob:propsDOB, contactNo:propsContactNo,
     gender:propsGender,address:propsAddress,country:propsCountry}=props;

    //create the state for the object

    const [firstName, setFirstName] = useState( propsFirstName,"");
    const [lastName, setLastName] = useState( propsLastName,"");
    const [email, setEmail] = useState( propsEmail,"");
    const [dob, setDOB] = useState( propsDOB,"");
    const [contactNo, setContactNo] = useState( propsContactNo,0);
    const [gender, setGender] = useState( propsGender,"");
    const [country, setCountry] = useState( propsCountry,"");
    const [address, setAddress] = useState( propsAddress,"");
    const [inputs, setInputs]= useState({});
    const [errors, setErrors] = useState({
        firstName: "",
        lastName: "",
        dob:"",
        gender:"",
        address:"",
        email:"",
        contactNo:0
    });
    const [isAddDisabled, setIsAddDisabled] = useState(false);
    const [isSubmitting, setIsSubmitting] = useState(false);

    //genders
    const genderList = [{name:'MALE',code:'M'},{name:'FEMALE',code:'F'},
        {name:'TRANSGENDER',code:'T'}];
    const [countries,setCountries]=[]=useState([]);
    useEffect(() => {
     fetchCountries().then(res=>{
         setCountries(res.data);
     })
    },[]);
    let countryArray=[];
     countries?.forEach(x=>{
         countryArray.push(x.name);
     })

    const msgs = useRef(null);

    useMountEffect(() => {
        msgs.current.show([
            { sticky: true, severity: 'success', summary: 'Success', detail: 'Closable Message'},
                 ]);
    });

    //event handling
    const handleOnChange=(event)=>{
        const name=event.target.name;
        const value=event.target.value;
        setInputs(values=>({...values,[name]:value}))
        if((inputs.firstName!=null)
            &&(inputs.lastName!=null)
            &&(inputs.email!=null)
            &&(inputs.contactNo>0)
            &&(inputs.gender!=null)
            &&(inputs.address!=null)
        )
            setIsAddDisabled(true);
    }
    function clearFields(event) {
        // we have to convert event.target to array
        // we use from method to convert event.target to array
        // after that we will use forEach function to go through every input to clear it
        Array.from(event.target).forEach((e) => (e.value = ""));
    }
    const handleSubmit=(event)=>{
        event.preventDefault();
        console.log(inputs);
        let response= validate(inputs)
        setErrors(response.errorsValue);
        console.log(errors);
        let isValid=response.status;
        if(isValid) {
            setIsAddDisabled(false);
            const year = inputs.dob.getFullYear();
            const month = String(inputs.dob.getMonth() + 1).padStart(2, '0');
            const day = String(inputs.dob.getDate()).padStart(2, '0');
            const convertedDate = `${year}-${month}-${day}`;

            inputs.dob=convertedDate;
            axios.post(restAPIUrl, inputs).then(res => {
                console.log(res);
                clearFields(event);
                setIsSubmitting(true);
            }).catch(error => {
                throw(error);
            });
        }

}








return(

 <div>
     <div className="card" hidden={!isSubmitting} >
         <Messages ref={msgs} />
     </div>
     <form onSubmit={handleSubmit} className="form border border-danger shadow-none p-3 rounded">
         <Fieldset legend="Customer Form">
         <span className="mt-5">
             <label htmlFor="firstName">First Name</label>
             <InputText name="firstName" type="text" pattern="[a-zA-Z]*" value={firstName} onChange={handleOnChange}  className="form-control"/>
             {errors.firstName &&
             <div style={{ color: "red", paddingBottom: 10 }}>
                 {errors.firstName}</div>
             }
         </span>
             <span className="mt-5">
             <label htmlFor="lastName" className="form-label">Last Name</label>
             <InputText name="lastName" type="text" pattern="[a-zA-Z]*" value={lastName} onChange={handleOnChange} className="form-control"/>
             {errors.lastName &&
                 <div style={{ color: "red", paddingBottom: 10 }}>
                     {errors.lastName}</div>
             }
         </span>
             <span className="mt-5">
             <label htmlFor="email" className="form-label">Email</label>
             <InputText name="email" type="email" value={email} onChange={handleOnChange} className="form-control"/>
             {errors.email &&
             <div style={{ color: "red", paddingBottom: 10 }}>
                 {errors.email}</div>
             }
         </span>
             <span className="mt-5">
              <label htmlFor="dob" className="form-label">DOB</label>
              <Calendar  name="dob" value={dob} className="w-100" onChange={handleOnChange}
                         dateFormat="yy/mm/dd"  touchUI />

                 {errors.dob &&
                 <div style={{ color: "red", paddingBottom: 10 }}>
                     {errors.dob}</div>
                 }
         </span>
         <span className="mt-5">
              <label htmlFor="contactNo" className="form-label">Contact No</label>
             <InputText name="contactNo" type="number" value={contactNo} onChange={handleOnChange} className="form-control"/>
             {errors.contactNo &&
             <div style={{ color: "red", paddingBottom: 10 }}>
                 {errors.contactNo}</div>
             }
         </span>
         <span className="mt-5">
             <label htmlFor="country" className="form-label">Country</label>
            <Dropdown name="country" value={country} options={countryArray}  placeholder="Select a Gender" className="form-select"/>

         </span>
         <span className="mt-5">
             <label htmlFor="gender" className="form-label">Gender</label>
            <Dropdown name="gender" value={gender} style={{color:"red"}}
                      options={genderList} onChange={handleOnChange}  optionValue="name"
                      optionLabel="name"
                      className="form-select"/>
             {errors.gender &&
             <div style={{ color: "red", paddingBottom: 10 }}>
                 {errors.gender}</div>
             }
         </span>
             <span className="mt-5">
               <label htmlFor="address" className="form-label">Address</label>
              <InputTextarea name="address" rows={5} cols={30} value={address}
                           autoResize  onChange={handleOnChange} className="form-control"/>
             {errors.address &&
             <div style={{ color: "red", paddingBottom: 10 }}>
                 {errors.address}</div>
             }
         </span>
            <span className="mt-5">
              <Button label="Submit" className="mt-3 form-control p-button-rounded p-button-danger"
                 disabled={!isAddDisabled}  />
             </span>
         </Fieldset>
     </form>
     <div>
         <LoanAgainstProperty input={inputs}/>
     </div>


 </div>

)

}
export default SavingsAccount;
