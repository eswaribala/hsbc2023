import React, {useState} from "react";
import {InputText} from 'primereact/inputtext'
import { Fieldset } from 'primereact/fieldset';
import { InputTextarea } from 'primereact/inputtextarea';
import { Button } from 'primereact/button';
import './savingsaccount.css'
//functional approach
//React Hook 16.8
function SavingsAccount(props) {

    //destructured object
    const{firstName:propsFirstName, lastName:propsLastName,
    email:propsEmail,dob:propsDOB, contactNo:propsContactNo,
     gender:propsGender,address:propsAddress}=props;

    //create the state for the object

    const [firstName, setFirstName] = useState( propsFirstName,"");
    const [lastName, setLastName] = useState( propsLastName,"");
    const [email, setEmail] = useState( propsEmail,"");
    const [dob, setDOB] = useState( propsDOB,"");
    const [contactNo, setContactNo] = useState( propsContactNo,0);
    const [gender, setGender] = useState( propsGender,"");
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


    //event handling
    const handleOnChange=(event)=>{
        const name=event.target.name;
        const value=event.target.value;
        setInputs(values=>({...values,[name]:value}))
        if((inputs.firstName.length>0)
            &&(inputs.lastName.length>5)
            &&(inputs.email.length>0)
            &&(inputs.contactNo>0)
            &&(inputs.gender.length>0)
            &&(inputs.address.length>5)
        )
            setIsAddDisabled(true);
    }

    const handleSubmit=(event)=>{

    }








    return(
            <div>
                <form className="form">
                    <Fieldset legend="Customer Form">
                    <span className="mt-5">
                        <label htmlFor="firstName">First Name</label>
                        <InputText id="firstName" value={firstName}  className="form-control"/>

                    </span>
                        <span className="mt-5">
                        <label htmlFor="lastName" className="form-label">Last Name</label>
                        <InputText id="lastName" value={lastName} className="form-control"/>

                    </span>
                        <span className="mt-5">
                        <label htmlFor="email" className="form-label">Email</label>
                        <InputText id="email" value={email} className="form-control"/>

                    </span>
                    <span className="mt-5">
                        <label htmlFor="dob" className="form-label">DOB</label>
                        <InputText id="dob" value={dob} className="form-control"/>

                    </span>
                    <span className="mt-5">
                         <label htmlFor="contactNo" className="form-label">Contact No</label>
                        <InputText id="contactNo" value={contactNo} className="form-control"/>

                    </span>
                    <span className="mt-5">
                        <label htmlFor="gender" className="form-label">Gender</label>
                        <InputText id="gender" value={gender} className="form-control"/>

                    </span>
                        <span className="mt-5">
                          <label htmlFor="address" className="form-label">Address</label>
                         <InputTextarea id="address" rows={5} cols={30} value={address}
                                      autoResize  className="form-control"/>
                    </span>
                       <span className="mt-5">
                         <Button label="Submit" className="mt-3 form-control p-button-rounded p-button-danger"
                            disabled={!isAddDisabled}  />
                        </span>
                    </Fieldset>
                </form>
            </div>
        )

}
export default SavingsAccount;
