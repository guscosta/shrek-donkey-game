package BYUI.CIT260.ShrekDonkeyGame.view;

import BYUI.CIT260.ShrekDonkeyGame.control.ProgramControl;
import BYUI.CIT260.ShrekDonkeyGame.model.Player;
import java.util.Scanner;

public class StartProgramView {
    
    public StartProgramView(){
        
    }

    public void startProgram(){

    //display banner screen
    this.displayBanner();
    //prompt player to enter his name and retrieve the name of the player
    String playersName = this.getPlayersName();
    //create and save the player object
    Player player = ProgramControl.createPlayer(playersName);
    //display a personalized welcome message
    this.displayWelcomeMessage(player);
    }

    public void displayBanner() {
        System.out.println("\n\n*************************************************");
                
        System.out.println("*                                                          *"
                + "\n* This is the game of Shrek and Donkey                     *"
                + "\n* In this game you will be taking on the role of Donkey    *"
                + "\n* As Donkey you will try to help Shrek save Princess Fiona *"
                + "\n* You will be able to influence Shrek's mood               *"
                + "\n* by being friendly or annoying                            *"
                + "\n* you will also be able to kick bad guys and do puzzles.   *");
        
        

        System.out.println("                                                           *"
                + "\n* Good luck and have fun in this adventure.                *"
                + "\n*                                                          *");
                
        System.out.println("*****************************************************");
                
    }

    public String getPlayersName() {
        boolean valid = false; //indicate if the name has been retrieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid) { //while a valid name has not been retrieved
            
            //prompt for the player's name
            System.out.println("Enter the player's name below:");
            
            //get the name from the keyboard and trim off the blanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            //if the name is invalid (less than 2 characters in length)
            if (playersName.length() < 2) {
                System.out.println("Invalid name - the name must not be blank");
                continue; //and repeat again
            
            }
            break; //out of the (exit) the repetition
        }
        
        return playersName; //return the name <---- you dont say?
        
    }

    public void displayWelcomeMessage(Player player) {
        System.out.println("\n\n============================================");
        System.out.println("\twelcome to the jungle " + player.getName());
        System.out.println("\twe got fun and games!");
        System.out.println("==============================================");
    }
    
}