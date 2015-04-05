package BYUI.CIT260.ShrekDonkeyGame.view;

import BYUI.CIT260.ShrekDonkeyGame.control.GameControl;
import BYUI.CIT260.ShrekDonkeyGame.exceptions.GameMenuViewException;
import BYUI.CIT260.ShrekDonkeyGame.model.Actor;
import BYUI.CIT260.ShrekDonkeyGame.model.Map;

public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\n----------------------------------------"
                + "\n| Game Menu                            |"
                + "\n----------------------------------------"
                + "\nM - Move to a new location"
                + "\nP - Use a Donkey phrase"
                + "\nK - Use a donkey kick"
                + "\nV - View map"
                + "\nR - Print character List"
                + "\nE - Go back to main menu"
                + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;
        char choice = value.toUpperCase().charAt(0);
        try {
            switch (choice) {
                case 'M': //Brings up the move to location menu.
                    this.displayLocation();
                    break;
                case 'P': // Brings up the phrase menu.
                    this.displayPhraseMenu();
                    break;
                case 'V': // Brings up the map. this.displayMap(); break;*
                    this.displayMap();
                    break;
                case 'K': // Brings up the kick menu.
                    this.displayKickMenu();
                    break;
                case 'R': // Prints the character list
                    this.printActors();
                    break;
                case 'E': // Goes back to the Main Menu.

                    return true;

                default:
                    ErrorView.display(this.getClass().getName(),
                            "\n*** Invalid selection *** Try again");
                    throw new GameMenuViewException("Your command cannot be processed"
                            + " because you did not enter a"
                            + " correct character");
            }
        } catch (GameMenuViewException ge) {
            ErrorView.display(this.getClass().getName(),
                    ge.getMessage());
        }

        return true;

    }

    private void displayLocation() {
        MoveToView moveToView = new MoveToView();
        moveToView.display();

    }

    private void displayPhraseMenu() {
        PhraseView phraseView = new PhraseView();
        phraseView.display();
    }

    private void displayKickMenu() {
        DonkeyKickView donkeyKickView = new DonkeyKickView();
        donkeyKickView.display();
    }

    private void displayMap() { 
        Map mapLocations = new Map(5,5);
        MapView mapView = new MapView(promptMessage);
        mapView.displayMap();
        mapLocations.getLocations();
    }

    private void printActors() {
        this.console.println("\n\nEtner the file path for file where the game "
                             + "is to be saved.");
        String filePath = this.getInput();
        
        try {
            // Print the actors to the specified file
            GameControl.printActors(Actor.values(), filePath);
            this.console.println("\n\nThe character list has been printed to "
                                 + "the specified file.");
        } catch (Exception ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
    }
     
}
    
     
      
     

