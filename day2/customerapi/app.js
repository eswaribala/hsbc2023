let config=require("./config");
let express=require("express");
let cors=require("cors");
var bodyParser =require("body-parser");

console.log(config.port);
//create express instance
let expressInstance=express();
//enable cors
expressInstance.use(cors());
//enable body parser
expressInstance.use(bodyParser.json());
expressInstance.use(express.urlencoded({ extended: true })); // support encoded bodies
//api url mapping
expressInstance.get("/",function(request,response){
 response.send("Rocking with nodejs express");
})

//post mapping
expressInstance.post("/customers/v1.0/",function(request,response){
 response.setHeader('Access-Control-Allow-Origin', '*');
 // Request methods you wish to allow
 response.setHeader('Access-Control-Allow-Methods', 'GET, POST, OPTIONS, PUT, PATCH, DELETE');
 // Request headers you wish to allow
 response.setHeader('Access-Control-Allow-Headers', 'X-Requested-With,content-type');
 // Set to true if you need the website to include cookies in the requests sent
 // to the API (e.g. in case you use sessions)
 response.setHeader('Access-Control-Allow-Credentials', true);

 console.log(request.body);
 response.send({"firstName":request.body.firstName});


})


expressInstance.set('port',config.port);

expressInstance.listen(expressInstance.get('port'), function()
{
 console.log('Server started at ....'+expressInstance.get('port'));
})



