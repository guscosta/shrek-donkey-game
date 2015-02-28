package BYUI.CIT260.ShrekDonkeyGame.view;

import java.util.Scanner;

/**
 *
 * 
 */
public class GameMenuView {

    private final String GAMEMENU = "\n"
            +"\n----------------------------------------"
            +"\n| Game Menu                            |"
            +"\n----------------------------------------"
            +"\nM - Move to a new location"
            +"\nP - Use a Donkey phrase"
            +"\nK - Use a donkey kick"
            +"\nH - Help"
            +"\nE - Go back to main menu"
            +"\n----------------------------------------";
    
    public void displayMenu() {
        
        char selection = ' ';
        do {
            System.out.println(GAMEMENU); //displays the menu again
            
            String input = this.getInput(); //get the user's selection
            selection = input.charAt(0); //get the first character of string
            
            this.doAction(selection); //do action based on selection
        } while (selection != 'E'); //a selection is not Exit        
    }
    
    public String getInput() {
        boolean valid = false; //indicate if the input has been retrieved
        String input = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid) { //while a valid input has not been retrieved
            
            //prompt for the player's choice
            System.out.println("Enter a character:");
            
            //get the input from the keyboard and trim off the blanks
            input = keyboard.nextLine();
            input = input.trim();
            
            //if the name is invalid (less than 2 characters in length)
            if (input.length() < 1) {
                System.out.println("Enter a a character listed in the Game Menu");
                continue; //and repeat again
            
            }
            break; //out of the (exit) the repetition
        }
        
        return input; //return the input
    }

    private void doAction(char choice) {
        
        switch (choice) {
            case 'M': //Brings up the move to location menu.
                this.displayLocation();
                break;
            case 'P': // Brings up the phrase menu.
                this.displayPhraseMenu();
                break;
            case 'K': // Brings up the kick menu.
                this.displayKickMenu();
                break;
            case 'H': // Brings up the help menu.
                this.displayHelpMenu();
                break;
            case 'E': // Goes back to the Main Menu.
                return;   
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                    break;
        }
    }

    private void displayLocation() {
        MoveToView moveToView = new MoveToView();
        moveToView.displayLocation();
    
    }

    private void displayPhraseMenu() {
        PhraseView phraseView = new PhraseView();
        phraseView.displayPhraseView();
    }

    private void displayKickMenu() {
        DonkeyKickView donkeyKickView = new DonkeyKickView();
        donkeyKickView.displayMenu();
    }

    private void displayHelpMenu() {
        GameMenuHelpView gameMenuHelpView = new GameMenuHelpView();
        gameMenuHelpView.displayHelpMenu();
    }
    }
