/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.ShrekDonkeyGame.view;

import java.util.Scanner;

/**
 *
 * @author hecto_000
 */
public class DonkeyKickView {

    void displayKickMenu() {
        System.out.println("Indicate the speed of the donkey kick:");
    }
   
    public String getInput() {
        boolean valid = false; //indicate if the input has been retrieved
        double kickSpeed;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid) { //while a valid input has not been retrieved
            
            //prompt for the player's choice
            System.out.println("Please enter a value from 1 to 33 for kick speed");
            
            //get the input from the keyboard and trim off the blanks
            kickSpeed = keyboard.nextLine();
            kickSpeed = kickSpeed.trim();
            
            //if the name is invalid (less than 2 characters in length)
            if (kickSpeed <= 0 || kickSpeed > 33) {
                System.out.println("Enter a a character listed in the Game Menu");
                continue; //and repeat again
            
            }
            break; //out of the (exit) the repetition
        }
        
        return input; //return the input
    }

    
}
