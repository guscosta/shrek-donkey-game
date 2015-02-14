/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.ShrekDonkeyGame.control;

public class DonkeyKickControl {

    public double calcKick(double enemyWeight, double kickSpeed) {
        if (enemyWeight <= 0){  
            // “Enemy weight is zero or a negative number”
            return -1;
        }
        if (kickSpeed <= 0 || kickSpeed > 33){
            // “Please enter a value from 1 to 33 for kick speed’”
            return -1;
        }
        
        double kickForce = (enemyWeight * kickSpeed) / 0.05;

        
        return kickForce;
    }


}


