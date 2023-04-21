
const ideaController =require("../controllers/idea.controller");


/**
 * Define route for the calls like
 * GET 127.0.0.1:8080/ideaApp/v1/ideas
 */

module.exports = (app) =>{
    app.get("/ideaApp/v1/ideas",ideaController.fetchAllIdeas);
}