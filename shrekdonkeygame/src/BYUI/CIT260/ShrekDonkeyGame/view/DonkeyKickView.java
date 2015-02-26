/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.ShrekDonkeyGame.view;

import BYUI.CIT260.ShrekDonkeyGame.control.DonkeyKickControl;
import java.util.*;

/**
 *
 * @author hecto_000
 */
public class DonkeyKickView {

    void displayKickMenu() {
        System.out.println("Indicate the speed of the donkey kick:");
    }
   
    public void getInput() {
        boolean valid = false; //indicate if the input has been retrieved
        double enemyWeight = 100;
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
        DonkeyKickControl donkeyKickControl = new DonkeyKickControl();
        double kickForce = donkeyKickControl.calcKick(enemyWeight, kickSpeed);
        System.out.println(kickForce);
        return;
    }
        
}

