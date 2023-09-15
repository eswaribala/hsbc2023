export function validate(values){
    let errors={
        firstName:"",
        lastName:"",
        dob:"",
        gender:"",
        contactNo:0,
        address:"",
        email:""
    }

    let isValid=true;

    if (!values.firstName) {
        errors.firstName = 'First Name Name is required';
        isValid=false;
    } else if (values.firstName.length < 5) {
        errors.firstName = 'First Name must be 5 or more characters';
        isValid=false;
    }
    if (!values.lastName) {
        errors.lastName = 'Last Name Name is required';
        isValid=false;
    } else if (values.lastName.length < 5) {
        errors.lastName = 'Last Name must be 5 or more characters';
        isValid=false;
    }

    if (values.contactNo<=0) {
        errors.contactNo = 'Contact No required';
        isValid=false;
    } else if (!/\d{10}/.test(values.contactNo)) {
        errors.contactNo = 'Contact No invalid';
        isValid=false;
    }

    let diff=new Date().getFullYear()-values.dob.getFullYear();
    if (!values.dob) {
        errors.dob = 'DOB required';
        isValid=false;
    } else if (diff<18) {
        errors.dob = 'DOB invalid';
        isValid=false;
    }
    if (!values.address) {
        errors.address = 'Address required';
        isValid=false;
    } else if (values.address.length < 5) {
        errors.address = 'Address invalid';
        isValid=false;
    }

    if (!values.email) {
        errors.email = 'Email required';
        isValid=false;
    }

    if (!values.gender) {
        errors.gender = 'Gender required';
        isValid=false;
    }


    let errorObj={
        errorsValue:errors,
        status:isValid
    }
    return errorObj;
}
