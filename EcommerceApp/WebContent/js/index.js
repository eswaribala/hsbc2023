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
        var fileRef=document.
        querySelector("#photo");
        var fileType=/image.*/;

        if(fileRef.files[0].type.match(fileType)){
           var fileReader=new FileReader();
            fileReader.readAsDataURL(fileRef.files[0]);
            fileReader.onload=function(){
                window.localStorage.setItem("profilePhoto",fileReader.result);
            }
        }
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
        window.localStorage.setItem("Employee",JSON.stringify(employee));
        createAjaxCall(employee); 
    })
})

function createAjaxCall(employee){
	var ajaxObj=null;
    try
    {
        ajaxObj = new XMLHttpRequest();
    }
    catch (e){
        try{
            ajaxObj = new ActiveXObject("Msxml2.XMLHTTP3.0"); }
        catch (e){
            alert("Your browser broke!");
            return false;
        }
    }


    ajaxObj.onreadystatechange=function(){
        //alert("State changed");
        let userArray;
        let response;
        if ((ajaxObj.readyState == 4 && ajaxObj.status == 200)) {
            response = ajaxObj.responseText;
            userArray = JSON.parse(response);

            userArray.forEach(x => {
                console.log(x.name, x.email);
            })
        }
    }
    ajaxObj.open("POST","RegistrationController",true);

    ajaxObj.send(employee);
}

