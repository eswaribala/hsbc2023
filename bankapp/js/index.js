window.addEventListener('load',function (){
    //alert("Ready to move on");
    window.addEventListener('submit',function (){
        //alert("Form submitted");
        var firstName=document.
         querySelector("#firstName").value;
        var lastName=document.
        querySelector("#lastName").value;
        var dob=document.
        querySelector("#dob").value;
        var gender=document.
        querySelector("#gender").value;
        var address=document.
        querySelector("#address").value;
        var contactNo=document.
        querySelector("#contactNo").value;
        var fileName=document.
        querySelector("#photo").value;

        //convert this into json
        var employee={
            "firstName":firstName,
            "lastName":lastName,
            "dob":dob,
            "contactNo":contactNo,
            "address":address,
            "gender":gender
        }
        console.log(JSON.stringify(employee));

    })
})
