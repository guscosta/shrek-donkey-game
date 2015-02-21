package BYUI.CIT260.ShrekDonkeyGame.view;

import BYUI.CIT260.ShrekDonkeyGame.control.GameControl;
import java.util.Scanner;
import shrekdonkeygame.Shrekdonkeygame;

public class MainMenuView {
    
    private final String MENU = "\n"
            +"\n----------------------------------------"
            +"\n| Main Menu                            |"
            +"\n----------------------------------------"
            +"\nG - Start game"
            +"\nS - Save the game"
            +"\nL - Load a saved game"
            +"\nH - Get help on how to play the game"
            +"\nE - Exit"
            +"\n----------------------------------------";

    public void displayMenu() {
        
        char selection = ' ';
        do {
            System.out.println(MENU); //displays the menu again
            
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
            System.out.println("Enter a value:");
            
            //get the input from the keyboard and trim off the blanks
            input = keyboard.nextLine();
            input = input.trim();
            
            //if the name is invalid (less than 2 characters in length)
            if (input.length() < 1) {
                System.out.println("Press the right button");
                continue; //and repeat again
            
            }
            break; //out of the (exit) the repetition
        }
        
        return input; //return the inputin <---- you dont say?
        
    }

    private void doAction(char choice) {
        
        switch (choice) {
            case 'G': //create and start a new game
                this.startNewGame();
                break;
            case 'L': //get and start an existing game
                this.startExistingGame();
                break;
            case 'H': //get help menu
                this.displayHelpMenu();
                break;
            case 'S': //save the current game
                this.saveGame();
                break;
            case 'E': //exit the program and never come back
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                    break;
        }
    }

    private void startNewGame() {
        //create a new game
        GameControl.createNewGame(Shrekdonkeygame.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("this thing is also working");
    }

    private void displayHelpMenu() {
        // display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenu();
    }

    private void saveGame() {
        System.out.println("you know the drill");
    }
    
}

