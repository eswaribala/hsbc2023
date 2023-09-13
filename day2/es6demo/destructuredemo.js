let userfile=require("./users");
//destructure the object

userfile.userData.map(x=>{
    const{lat,lng}=x.address.geo;
    console.log(`(${lat},${lng})`)
})
//enhanced for loop
for(const[index,elem] of userfile.userData.entries()){
    const{name,catchPhrase,bs}=elem.company;
    console.log(`(${index},${name},${catchPhrase},${bs})`)
}
