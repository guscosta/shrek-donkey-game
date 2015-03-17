package BYUI.CIT260.ShrekDonkeyGame.view;

public class HelpMenuView extends View{
    
    public HelpMenuView(){
        super("\n"
            +"\n----------------------------------------"
            +"\n| Help Menu                            |"
            +"\n----------------------------------------"
            +"\nG - What is the purpose of the game"
            +"\nM - How to move"
            +"\nA - About annoying phrases"
            +"\nK - About donkey kick"
            +"\nP - About puzzles"
            +"\nE - Exit"
            +"\n----------------------------------------");
    }
    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        char choice = value.toUpperCase().charAt(0); 
        
        switch (choice) {
            case 'G': //show purpose help
                this.getPurpose();
                break;
            case 'M': //show move help
                this.getMoveHow();
                break;
            case 'A': //show annoying phrases help
                this.getAnnoying();
                break;
            case 'H': //show friendly phrases help
                this.getFriendly();
                break;
            case 'P': //show puzzles help
                this.getPuzzle();
                break;
            case 'K': //show donkey kick help
                this.getKick();
                break;
            case 'E': //go back to main menu

            return true;
        }
        return true;

    }

    private void getPurpose() {
        System.out.println("this works");
    }

    private void getMoveHow() {
        System.out.println("this works too");    
    }

    private void getAnnoying() {
        System.out.println("this works as well");
    }

    private void getFriendly() {
        System.out.println("the meaning of life is 42");
    }

    private void getPuzzle() {
        System.out.println("riddle me this batman");
    }

    private void getKick() {
        System.out.println("imma kick you in the face");
    }
}
