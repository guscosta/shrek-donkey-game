package BYUI.CIT260.ShrekDonkeyGame.view;

import java.util.Scanner;

public class MoveToView {
    
    private final String MOVEMENU = "\n"
            +"\n----------------------------------------"
            +"\n| Move to location                     |"
            +"\n----------------------------------------"
            +"\nG - Enter location                     |"
            +"\nE - Go back to Game menu               |"
            +"\n----------------------------------------";
    
    public void displayLocation() {
        
        char selection = ' ';
        do {
            System.out.println(MOVEMENU); //displays the menu again
            
            String input = this.getInput(); //get the user's selection
            selection = input.charAt(0); //get the first character of string
            
            this.doAction(selection); //do action based on selection
        } while (selection != 'E'); //a selection is not Exit        
    }

    private String getInput() {
        boolean valid = false; //indicate if the input has been retrieved
        String input = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid) { //while a valid input has not been retrieved
            
            //prompt for the player's choice
            System.out.println("Enter a value:");
            
            //get the input from the keyboard and trim off the blanks
            input = keyboard.nextLine();
            input = input.trim();
            
            //if the name is invalid (less than 2 characters in length)
            if (input.length() < 1) {
                System.out.println("Press a button");
                continue; //and repeat again
            
            }
            break; //out of the (exit) the repetition
        }
        
        return input; //return the inputin <---- you dont say?
    }
    private void doAction(char choice) {
        
    switch (choice) {
            case 'G': //go to a coordinate entering screen
                this.getCoordinate();
                break;
            case 'E': //go back to main menu
            return;
            default: 
                System.out.println("\n*** Invalid selection *** Try again");
                    break;
    }
}

    private void getCoordinate() {
               
        boolean valid = false; //indicate if the input has been retrieved
        String input = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid) { //while a valid input has not been retrieved
            
            //prompt for the player's choice
            System.out.println("Enter a value:");
            
            //get the input from the keyboard and trim off the blanks
            input = keyboard.nextLine();
            input = input.trim();
            
            //if the name is invalid (less than 2 characters in length)
            if (input.length() < 1) {
                System.out.println("Press a button");
                continue; //and repeat again
                        }
            }
        }
    }