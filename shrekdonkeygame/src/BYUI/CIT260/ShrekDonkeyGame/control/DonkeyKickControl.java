/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.ShrekDonkeyGame.control;

import BYUI.CIT260.ShrekDonkeyGame.exceptions.DonkeyKickControlException;

public class DonkeyKickControl {

    public static double calcKick(double enemyWeight, double kickSpeed) 
            throws DonkeyKickControlException {
        if (enemyWeight <= 0){  
            // “Enemy weight is zero or a negative number”
            throw new DonkeyKickControlException("Enemy weight cannot be 0 or"
                                                + "lower.");
        }
        if (kickSpeed <= 0 || kickSpeed > 33){
            // “Please enter a value from 1 to 33 for kick speed’”
            throw new DonkeyKickControlException("Cannot process the Donkey Kick "
                                               + "because the kick speed is lower" 
                                               + "than 0 or greater than 33");
        }
        
        double kickForce = (enemyWeight * kickSpeed) / 0.05;

           
        return kickForce;
    }
    
   public static boolean enemyDefeated(double kickForce, double enemyWeight) {
       System.out.println("Enemy defeated called");
       return true;
   }


}


