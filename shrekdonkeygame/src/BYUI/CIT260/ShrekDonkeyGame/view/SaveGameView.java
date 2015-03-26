/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.ShrekDonkeyGame.view;

import BYUI.CIT260.ShrekDonkeyGame.control.GameControl;
import shrekdonkeygame.Shrekdonkeygame;

/**
 *
 * @author hecto_000
 */
public class SaveGameView extends View{

    public SaveGameView() {
        super("\n"
            +"\n----------------------------------------"
            +"\n| Save Game                            |"
            +"\n----------------------------------------"
            +"\nY - Yes, I want to save my progress"
            +"\nN - No, I don't want to save my progress"
            +"\nE - Go back to Main Menu"
            +"\n----------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        char choice = value.toUpperCase().charAt(0); 
        
    switch (choice) {
            case 'Y': //User wants to save game progress
                this.saveGame();
                break;
            case 'N': //User does not want to save game progress
                return true;
            case 'E':
                return true;
            default: 
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
                return false;
    }
    return false;
    
}

    private void saveGame() {
        this.console.println("\n\nEnter the file path for file where the game "
                             + "is to be saved.");
        String filePath = this.getInput();
        
        try {
            // save the game to the specified file
            GameControl.saveGame(Shrekdonkeygame.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("SaveGameView", ex.getMessage());
        }
    }
}
