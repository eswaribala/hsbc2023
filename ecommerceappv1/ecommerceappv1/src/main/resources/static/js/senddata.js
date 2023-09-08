window.addEventListener('load',function(){

   
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
            console.log(response);
        }
    }
    ajaxObj.open("POST","https://reqres.in/api/users",true);
    let user={
        "First_Name":"Parameswari",
        "Last_Name":"Bala",
        "Account_No":2469326,
        "IFSC_Code":"HSBC0001"
    }
    ajaxObj.send(user);

})

