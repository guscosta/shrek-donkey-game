/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.ShrekDonkeyGame.view;

/**
 *
 * @author gustavo
 */
public class PuzzleView extends View {
    
    public PuzzleView() {
        super("\n "
                + "The weight of shrek and donkey is 250 pounds divided between 2 character"
                + "the distance needed to jump is 4 meters"
                + "calculate the amount of force needed to make the jump (weight * distance / 2^2)");
    }
    
    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        char choice = value.toUpperCase().charAt(0); 
        
        switch (choice) {
            case 'S': //solve puzzle.
                this.displayPuzzleIn();
                break;
            case 'R': // turn back.
                this.displayNegative();
                break;
            case 'E': // Goes back to the Main Menu.
                return true;   
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
                    break;
        }
        return true;
    }

    private void displayPuzzleIn() {
        this.console.println("this will display the puzzle calculation input");
    }

    private void displayNegative() {
        this.console.println("you can't turn back now the dragon will eat you!");
    }
}
