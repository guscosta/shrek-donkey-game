package BYUI.CIT260.ShrekDonkeyGame.view;

import BYUI.CIT260.ShrekDonkeyGame.control.GameControl;
import shrekdonkeygame.Shrekdonkeygame;

public class MainMenuView extends View {
    
     public MainMenuView(){
        super("\n"
            +"\n----------------------------------------"
            +"\n| Main Menu                            |"
            +"\n----------------------------------------"
            +"\nG - Start game"
            +"\nS - Save the game"
            +"\nL - Load a saved game"
            +"\nH - Get help on how to play the game"
            +"\nE - Exit"
            +"\n----------------------------------------");
     }
    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        char choice = value.toUpperCase().charAt(0); 
        
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
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");

                    return false;
        }
        return true;


    }

    private void startNewGame() {
        //create a new game
        GameControl.createNewGame(Shrekdonkeygame.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExistingGame() {
        System.out.println("this thing is also working");
    }

    private void displayHelpMenu() {
        // display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        // display the save game menu
        SaveGameView saveMenu = new SaveGameView();
        saveMenu.display();
    }
    
}

