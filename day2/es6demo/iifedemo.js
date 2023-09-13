//IIFE
let invoke=function({firstName="First Name",
                    lastName="LastName",email="Email"}){

    console.log( firstName+"-"+lastName+","+email);
}
//("Parameswari","bala","Param@gmail.com");

//console.log(invoke);

//handling named parameters
invoke({lastName:"Bala",firstName:"Vignesh",email:"viki@gmail.com"});
