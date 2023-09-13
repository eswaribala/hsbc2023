//import file system library
let fs=require('fs');
//synchronous call
let data=fs.readFileSync("employees.txt");
console.log("Content of the file.....");
console.log(data.toString());

//asynchronous call
fs.readFile("employees.txt",function (err,data){
   if(err)
      console.log(err);
   else
      console.log(data.toString());

})

console.log("I am in main module");

