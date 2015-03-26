/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.ShrekDonkeyGame.view;

import BYUI.CIT260.ShrekDonkeyGame.control.DonkeyKickControl;
import BYUI.CIT260.ShrekDonkeyGame.exceptions.DonkeyKickControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hecto_000
 */
public class DonkeyKickView extends View {

    double enemyWeight = 100;

    public DonkeyKickView() {
        super("Indicate the speed of the donkey kick");
    }

    @Override
    public boolean doAction(Object obj) {
        String inputValue = (String) obj;
        double kickSpeed = 0;
        try {
            // parse and convert number from text to a double
            kickSpeed = Double.parseDouble(inputValue);

        } catch (NumberFormatException nf) {

            ErrorView.display(this.getClass().getName(),
                    "\nYou must enter a valid number."
                    + " Try again or enter Q to quit.");
        }
        if (kickSpeed <= 0 || kickSpeed > 33) {
            ErrorView.display(this.getClass().getName(),
                    "Enter a value from 1 to 33 for kick speed");
            return false;
        }
        double force = 0;
        try {
            force = DonkeyKickControl.calcKick(this.enemyWeight, kickSpeed);
        } catch (DonkeyKickControlException de) {
            ErrorView.display(this.getClass().getName(),
                    de.getMessage());
        }
        // Call the enemyDefeated function to determine if the enemy was defeated
        boolean defeated = DonkeyKickControl.enemyDefeated(force, this.enemyWeight);
        // If enemy was defeated display positive message
        if (defeated == true) {
            this.console.println("You have defeated your enemy!");
        } else {
            // Else if he was not display negative message and let user enter another value.
            this.console.println("You have another chance to enter a kick speed.");
            MainMenuView mainMenuTwo = new MainMenuView();
            mainMenuTwo.display();
        }

        return true;
        /**
         *
         * if (testscore >= 90) { grade = 'A'; } else if (testscore >= 80) {
         * grade = 'B'; } else if (testscore >= 70) { grade = 'C'; } else if
         * (testscore >= 60) { grade = 'D'; } else { grade = 'F'; }
         */
    }
}
