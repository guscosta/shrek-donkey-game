/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.ShrekDonkeyGame.view;

import BYUI.CIT260.ShrekDonkeyGame.control.DonkeyKickControl;
import BYUI.CIT260.ShrekDonkeyGame.model.Player;
import java.util.*;

/**
 *
 * @author hecto_000
 */
public class DonkeyKickView {
    double enemyWeight = 100;
    
    public void displayMenu() {
        
        double kickSpeed;
        do {
            System.out.println("Indicate the speed of the donkey kick:"); //displays the indicate speed kick menu.
            kickSpeed = this.getInput(); //get the user's kick speed input
           
            this.doAction(kickSpeed); //do action based on selection
        } while (kickSpeed == 0); //a selection is not Exit        
    }
   
    public double getInput() {
        double kickSpeed = 0;
        Scanner in = new Scanner(System.in); //keyboard input stream
        
        while(kickSpeed == 0) { //while a valid input has not been retrieved
            
            //prompt for the player's choice
            System.out.println("Please enter a value from 1 to 33 for kick speed");
            
            //get the input from the keyboard
            kickSpeed = in.nextDouble();
            
            //if the name is invalid (less than 2 characters in length)
            if (kickSpeed <= 0 || kickSpeed > 33) {
                System.out.println("Enter a value from 1 to 33 for kick speed");
                continue; //and repeat again
            
            }
            break; //out of the (exit) the repetition
        }
        return kickSpeed;
        //DonkeyKickControl donkeyKickControl = new DonkeyKickControl(); //assigns a memory address to donkeyKickControl
        //double kickForce = DonkeyKickControl.calcKick(enemyWeight, kickSpeed);
        //System.out.println(kickForce);
        //return;
    }
     
    private void doAction(double kickSpeed) {
        double force = DonkeyKickControl.calcKick(this.enemyWeight, kickSpeed);
        // Call the enemyDefeated function to determine if the enemy was defeated
        boolean defeated = DonkeyKickControl.enemyDefeated(force, this.enemyWeight);
        // If enemy was defeated display positive message
        if (defeated == true) {
            System.out.println("You have defeated your enemy!");
        }
        else {
            // Else if he was not display negative message and let user enter another value.
            System.out.println("You have another chance to enter a kick speed.");
            MainMenuView mainMenuTwo= new MainMenuView();
            mainMenuTwo.displayMenu();
        }
    }
}

