import React, {useState} from "react";
import {InputText} from 'primereact/inputtext'
import { Fieldset } from 'primereact/fieldset';
import { InputTextarea } from 'primereact/inputtextarea';
import { Button } from 'primereact/button';
import { Calendar } from 'primereact/calendar';
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
        if((inputs.firstName!=null)
            &&(inputs.lastName!=null)
            &&(inputs.email!=null)
            &&(inputs.contactNo>0)
            &&(inputs.gender!=null)
            &&(inputs.address!=null)
        )
            setIsAddDisabled(true);
    }

    const handleSubmit=(event)=>{

        console.log(inputs);
    }








    return(
            <div>
                <form onSubmit={handleSubmit} className="form">
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
                         <Calendar  name="dob" value={dob} className="w-100" onChange={handleOnChange} touchUI />

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
                        <label htmlFor="gender" className="form-label">Gender</label>
                        <InputText name="gender" type="text" value={gender} onChange={handleOnChange} className="form-control"/>
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
            </div>
        )

}
export default SavingsAccount;
