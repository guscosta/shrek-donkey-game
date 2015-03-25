package BYUI.CIT260.ShrekDonkeyGame.view;

import BYUI.CIT260.ShrekDonkeyGame.control.MapControl;
import BYUI.CIT260.ShrekDonkeyGame.model.Actor;
import java.util.Scanner;

public class MoveToView extends View {

    public MoveToView() {
        super("\n"
                + "\n----------------------------------------"
                + "\n| Move to location                     |"
                + "\n----------------------------------------"
                + "\nG - Enter location                     |"
                + "\nE - Go back to Game menu               |"
                + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {
        //   Actor actor = null;
        //   try {
        //     MapControl.moveActorToLocation(actor, Actor.);
        //   }
        String value = (String) obj;
        char choice = value.toUpperCase().charAt(0);

        switch (choice) {
            case 'G': //go to a coordinate entering screen
                this.getCoordinate();
                break;
            case 'E': //go back to main menu
                return true;
            default:

                break;

        }
        return false;
    }

    private void getCoordinate() {

        boolean valid = false; //indicate if the input has been retrieved
        String input = null;
        try {
            while (!valid) { //while a valid input has not been retrieved

                //prompt for the player's choice
                System.out.println("Enter a value:");

                //get the input from the keyboard and trim off the blanks
                input = this.keyboard.readLine();
                input = input.trim();

                //if the name is invalid (less than 2 characters in length)
                if (input.length() < 1) {
                    System.out.println("Press a button");
                    continue; //and repeat again
                }
            }
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }

    }
}
