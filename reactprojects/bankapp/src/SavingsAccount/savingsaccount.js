import React, {useState} from "react";
import {InputText} from 'primereact/inputtext'
import { Fieldset } from 'primereact/fieldset';
import { InputTextarea } from 'primereact/inputtextarea';
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








    return(
            <div>
                <form className="form">
                    <Fieldset legend="Customer Form">
                    <span className="mt-5">
                        <InputText id="in" value={firstName}  className="form-control"/>
                        <label htmlFor="in">First Name</label>
                    </span>
                        <span className="mt-5">
                        <InputText id="in" value={lastName} className="form-control"/>
                        <label htmlFor="in" className="form-label">Last Name</label>
                    </span>
                        <span className="mt-5">
                        <InputText id="in" value={email} className="form-control"/>
                        <label htmlFor="in" className="form-label">Email</label>
                    </span>
                    <span className="mt-5">
                        <InputText id="in" value={dob} className="form-control"/>
                        <label htmlFor="in" className="form-label">DOB</label>
                    </span>
                        <span className="mt-5">
                        <InputText id="in" value={contactNo} className="form-control"/>
                        <label htmlFor="in" className="form-label">Contact No</label>
                    </span>
                    <span className="mt-5">
                        <InputText id="in" value={gender} className="form-control"/>
                        <label htmlFor="in" className="form-label">Gender</label>
                    </span>
                        <span className="mt-5">
                         <InputTextarea id="in" rows={5} cols={30} value={address}
                                      autoResize  className="form-control"/>

                        <label htmlFor="in" className="form-label">Address</label>
                    </span>
                    </Fieldset>
                </form>
            </div>
        )

}
export default SavingsAccount;
