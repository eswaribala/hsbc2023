let firstName="Parameswari";
let lastName="Bala";
//string interpolation
console.log(`(${firstName},${lastName})`);

let data=[];
for(let i=0;i<100;i++){
    data.push(Math.random().toFixed(3)*1000);
}
//es6
//arrow function
data.map(x=>{
    console.log(x*2,"\t");
})
