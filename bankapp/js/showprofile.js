window.addEventListener('load',function(){

    if(window.localStorage.getItem("Employee")!=undefined){
        if(window.localStorage.getItem("profilePhoto")!=undefined){

           var employeeData= window.localStorage.getItem("Employee");

           //json string to javascript object
           var empObj= JSON.parse(employeeData);
           console.log(empObj);
           //table ref
            var tableRef=document.querySelector("#profile");
            row=document.createElement("tr");
            col=document.createElement("td");
            text=document.createTextNode(empObj.firstName);
            col.appendChild(text);
            row.appendChild(col);
            col=document.createElement("td");
            text=document.createTextNode(empObj.lastName);
            col.appendChild(text);
            row.appendChild(col);
            col=document.createElement("td");
            text=document.createTextNode(empObj.dob);
            col.appendChild(text);
            row.appendChild(col);
            col=document.createElement("td");
            text=document.createTextNode(empObj.address);
            col.appendChild(text);
            row.appendChild(col);
            tableRef.appendChild(row);
            var figureRef=document.querySelector("#photo");
            var image=new Image();
            image.onload = function (evt) {

                figureRef.appendChild(image);

            }
           image.src=window.localStorage.getItem("profilePhoto");



        }
    }


})
