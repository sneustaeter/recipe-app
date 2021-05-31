package com.sneustaeter.recipeapp;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Do some shit
        
        //Scanner scr = new Scanner(System.in);
        String name = JOptionPane.showInputDialog(null, "Please enter the name of the recipe" );
        String description = JOptionPane.showInputDialog(null, "Please enter a breif description of the recipe");
        int prepTime = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the time required for prep"));
        int cookTime = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the time required for cooking"));
    }

}
