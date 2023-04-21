
const ideas = require("../models/idea.model");


/**
 * Search all idea
 */

exports.fetchAllIdeas = (req , res) => {
 res.status(200).send(ideas);
}

let idCount = 1 ;

/**
 * Create new idea
 */
exports.createIdea = (req, res) =>{
    // Read the reuqest body
     const idea = req.body ;
    // Need to generate th next idea 
     idea.id = ++idCount;
    // Save it in the list of existing idea
   ideas[idCount] = idea ;
    //return the response
    res.status(201).send(ideas[idCount]);
}

/**
 * Update idea
 */

/**
 * Delete idea
 */