package BYUI.CIT260.ShrekDonkeyGame.view;

import BYUI.CIT260.ShrekDonkeyGame.control.ShrekStateControl;
import BYUI.CIT260.ShrekDonkeyGame.model.Phrase;

public class PhraseView extends View {

    private Phrase phrase;

    public PhraseView() {
        super("\n"
            +"\n-------------------------------------------------"
            +"\n| Choose a phrase to say                        |"
            +"\n-------------------------------------------------"
            +"\n1 - Everybody likes parfait!"
            +"\n2 - So... want a waffle?"
            +"\n3 - Ain't nobody got anything on my friend Shrek!"
            +"\n4 - it's ok i like onions and cakes"
            +"\nE - Exit"
            +"\n-------------------------------------------------");
}
    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        char choice = value.toUpperCase().charAt(0); 
        
        switch (choice) {
            case '1': {
            this.getPhraseOne(phrase);
        }
                break;
            case '2': //choose phrase 2
                this.getPhraseTwo();
                break;
            case '3': //choose phrase 3
                this.getPhraseThree();
                break;
            case '4': //choose phrase 4
                this.getPhraseFour();
                break;
            case 'E': //go back to main menu

            return true;


            default: 
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
                return false; 
        }

        return true;



    }

    public void getPhraseOne(Phrase phrase) {
        this.console.println("you have successfully annoyed shrek!");
        ShrekStateControl.calcShrekState(phrase);
             
    }

    private void getPhraseTwo() {
        this.console.println("you have successfully annoyed shrek AND he slapped you in the face");
    }

    private void getPhraseThree() {
        this.console.println("somehow shrek feels nicer around you");
    }

    private void getPhraseFour() {
        this.console.println("shrek kinda likes what youre saying");
    }

}
