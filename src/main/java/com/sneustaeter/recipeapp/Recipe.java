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
    
    //Empty constructor, dont use me
    public Recipe(){
        
    }
    
    //Constructor that takes in basic recipe information
    public Recipe(String nameIn, String descriptionIn, String[] ingredientsIn){
        name = nameIn;
        description = descriptionIn;
        ingredients = ingredientsIn;
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
}
