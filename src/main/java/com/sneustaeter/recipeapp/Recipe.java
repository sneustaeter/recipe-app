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
    /*The tags array will hold many single word/short phrase tags used to search and index
    the recipes*/
    public String[] tags;
    
    //Empty constructor, dont use me
    public Recipe(){
        
    }
    
    //Constructor that takes in basic recipe information
    public Recipe(String nameIn, String descriptionIn, String[] ingredientsIn, String[] stepsIn){
        name = nameIn;
        description = descriptionIn;
        ingredients = ingredientsIn;
        steps = stepsIn;
    }
    
    
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
    
    
    public String[] getTags(){
        return tags;
    }
    public void setTags(String[] tagsIn){
        tags = tagsIn;
    }
    
    
    
    //toString method for making human readable String output
    @Override
    public String toString(){
        
        String outStr = "Name: " + name;
        outStr += "\n\tDescription: " + description;
        //FINISH ME
        return outStr;
    }
}
