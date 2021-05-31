package com.sneustaeter.recipeapp;

/**
 *
 * @author sneustaeter
 */

public class Recipe {
    
    //Global vars for recipe information
    public String name = "";
    public String description = "";
    public String[] ingredients;
    public String[] steps;
    int prepTime = 0; // Times are in minutes
    int cookTime = 0; // Times are in minutes
    int totalTime = 0;
    /*The tags array will hold many single word/short phrase tags used to search and index
    the recipes*/
    public String[] tags;
    
    //Empty constructor, dont use me
    public Recipe(){
        
    }
    
    //Constructor that takes in basic recipe information
    public Recipe(String nameIn, String descriptionIn, String[] ingredientsIn, String[] stepsIn, int prepTimeIn, int cookTimeIn){
        name = nameIn;
        description = descriptionIn;
        ingredients = ingredientsIn;
        steps = stepsIn;
        prepTime = prepTimeIn;
        cookTime = cookTimeIn;
        
        updateTotalTime();
    }
    
    
    
    /* Getters and setters start here */
    /* ============================== */
    public String getName(){
        return name;
    }
    public void setName(String nameIn){
        name = nameIn;
    }
    
    
    public String getDescription(){
        return description;
    }
    public void setDescription(String descriptionIn){
        description = descriptionIn;
    }
    
    
    public String[] getIngredients(){
        return ingredients;
    }
    public void setIngredients(String[] ingredientsIn){
        ingredients = ingredientsIn;
    }
    
    
    public String[] getSteps(){
        return steps;
    }
    public void setSteps(String[] stepsIn){
        steps = stepsIn;
    }
    
    public int getPrepTime(){
        return prepTime;
    }
    public void setPrepTime(int prepTimeIn){
        prepTime = prepTimeIn;
    }
    
    
    public int getCookTime(){
        return cookTime;
    }
    public void setCookTime(int cookTimeIn){
        cookTime = cookTimeIn;
    }
    
    
    public String[] getTags(){
        return tags;
    }
    public void setTags(String[] tagsIn){
        tags = tagsIn;
    }
    
    /* Getters and setters end here */
    /* ============================== */
    
    
    
    //toString method for making human readable String output
    @Override
    public String toString(){
        
        String outStr = "Name: " + name;
        outStr += "\n\tDescription: " + description;
        outStr += "\n\tPrep Time: " + prepTime + " minutes\tCook Time: " + cookTime + " minutes\tTotal Time: " + totalTime + " minutes";
        outStr += "\n\tIngredients:";
        
        //For loop to process ingredient array
        for (int i = 0; i < ingredients.length; i++){
            outStr += "\n\t\t" + ingredients[i];
        }
        
        outStr += "\n\tDirections: ";
        
        //for loop to process steps array
        for(int i = 0; i < steps.length; i++){
            outStr += "\n\t\t" + steps[i];
        }
        
        //FINISH ME
        return outStr;
    }
    
    
    
    // Calculates and updates the total time needed for a recipe
    public void updateTotalTime(){
        totalTime = prepTime + cookTime;
    }
}
