import React, {useState} from "react";
import {InputText} from 'primereact/inputtext'
import { Fieldset } from 'primereact/fieldset';
import { InputTextarea } from 'primereact/inputtextarea';
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
                <form>
                    <Fieldset legend="Customer Form">
                    <span className="p-float-label">
                        <InputText id="in" value={firstName}/>
                        <label htmlFor="in">First Name</label>
                    </span>
                        <span className="p-float-label">
                        <InputText id="in" value={lastName}/>
                        <label htmlFor="in">Last Name</label>
                    </span>
                        <span className="p-float-label">
                        <InputText id="in" value={email}/>
                        <label htmlFor="in">Email</label>
                    </span>
                    <span className="p-float-label">
                        <InputText id="in" value={dob}/>
                        <label htmlFor="in">DOB</label>
                    </span>
                        <span className="p-float-label">
                        <InputText id="in" value={contactNo}/>
                        <label htmlFor="in">Contact No</label>
                    </span>
                    <span className="p-float-label">
                        <InputText id="in" value={gender}/>
                        <label htmlFor="in">Gender</label>
                    </span>
                        <span className="p-float-label">
                         <InputTextarea id="in" rows={5} cols={30} value={address}
                                      autoResize />

                        <label htmlFor="in">Address</label>
                    </span>
                    </Fieldset>
                </form>
            </div>
        )

}
export default SavingsAccount;
