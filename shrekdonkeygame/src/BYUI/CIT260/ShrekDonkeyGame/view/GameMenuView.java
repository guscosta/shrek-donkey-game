package BYUI.CIT260.ShrekDonkeyGame.view;

/**
 *
 * 
 */
public class GameMenuView extends View {

    public GameMenuView(){
        super("\n"
            +"\n----------------------------------------"
            +"\n| Game Menu                            |"
            +"\n----------------------------------------"
            +"\nM - Move to a new location"
            +"\nP - Use a Donkey phrase"
            +"\nK - Use a donkey kick"
            //+"\nH - Help"
            +"\nE - Go back to main menu"
            +"\n----------------------------------------");
    }
    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        char choice = value.toUpperCase().charAt(0); 
        
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
            //case 'H': // Brings up the help menu.
            //    this.displayHelpMenu();
            //    break;
            case 'E': // Goes back to the Main Menu.
                return true;   
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                    break;
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

    //private void displayHelpMenu() {
    //    GameMenuHelpView gameMenuHelpView = new GameMenuHelpView();
    //    gameMenuHelpView.display();
    }
    
