/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.ShrekDonkeyGame.view;

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
                System.out.println("\n*** Invalid selection *** Try again");
                return false;
    }
    return false;
    
}

    private void saveGame() {
        System.out.println("Your game has been saved succesfully.");
    }
}
