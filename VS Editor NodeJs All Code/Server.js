const express = require("express");

const app = express();

function myMiddleWare(req, res , next){
    console.log("Inside the middle ware Id created");
    next(); // It will pass on the control to the next step
}

/**
 * Stich the routes to the server
 */
require("./routes/idea.routes")(app);

/**
 * Starting server
 */
app.listen(8080, ()=>{
    console.log("Server started");
})