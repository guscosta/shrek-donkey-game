package BYUI.CIT260.ShrekDonkeyGame.view;

public class StartProgramView {
    
    public StartProgramView(){
        
    }

    public void startProgram(){

    //display banner screen
    this.displayBanner();
    }

    public void displayBanner() {
        System.out.println("\n\n*********************************************");
                
        System.out.println("*                                *"
                + "\n* This is the game of Shrek and Donkey *"
                + "\n* In this game you will be taking on the role of Donkey *"
                + "\n* As Donkey you will try to help Shrek save Princess Fiona *"
                + "\n* You will be able to influence Shrek's mood *"
                + "\n* by being friendly or annoying *"
                + "\n* you will also be able to kick bad guys and do puzzles. *");
        
        

        System.out.println("                                                *");
                + "\n* Good luck and have fun in this adventure");
                
        System.out.Println("**************************************************");
                
        
    }
    
    
}