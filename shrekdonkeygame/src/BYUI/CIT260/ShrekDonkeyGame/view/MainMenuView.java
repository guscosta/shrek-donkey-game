package BYUI.CIT260.ShrekDonkeyGame.view;

import BYUI.CIT260.ShrekDonkeyGame.control.GameControl;
import BYUI.CIT260.ShrekDonkeyGame.exceptions.MapControlException;
import shrekdonkeygame.Shrekdonkeygame;

public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n----------------------------------------"
                + "\n| Main Menu                            |"
                + "\n----------------------------------------"
                + "\nG - Start game"
                + "\nS - Save the game"
                + "\nL - Load a saved game"
                + "\nH - Get help on how to play the game"
                + "\nE - Exit"
                + "\n----------------------------------------");
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
                this.console.println("\n*** Invalid selection *** Try again");

                return false;
        }
        return true;

    }

    private void startNewGame() {
        //create a new game
        try {
            GameControl.createNewGame(Shrekdonkeygame.getPlayer());
        } catch (MapControlException me) {
            ErrorView.display(this.getClass().getName(),
                    me.getMessage());
        }
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExistingGame() {
        // prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for file where the game "
                             + "is to be saved.");
        
        String filePath = this.getInput();
        
        try {
            //start a saved game
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
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
