package BYUI.CIT260.ShrekDonkeyGame.view;

import java.util.Scanner;

public class HelpMenuView {
    
    private final String HELPMENU = "\n"
            +"\n----------------------------------------"
            +"\n| Help Menu                            |"
            +"\n----------------------------------------"
            +"\nG - What is the purpose of the game"
            +"\nM - How to move"
            +"\nA - About annoying phrases"
            +"\nK - About donkey kick"
            +"\nP - About puzzles"
            +"\nE - Exit"
            +"\n----------------------------------------";
    
    public void displayHelpMenu() {
        
        char selection = ' ';
        do {
            System.out.println(HELPMENU); //displays the menu again
            
            String input = this.getInput(); //get the user's selection
            selection = input.charAt(0); //get the first character of string
            
            this.doAction(selection); //do action based on selection
        } while (selection != 'E'); //a selection is not Exit        
    }

    private String getInput() {
        boolean valid = false; //indicate if the input has been retrieved
        String input = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid) { //while a valid input has not been retrieved
            
            //prompt for the player's choice
            System.out.println("Enter a value:");
            
            //get the input from the keyboard and trim off the blanks
            input = keyboard.nextLine();
            input = input.trim();
            
            //if the name is invalid (less than 2 characters in length)
            if (input.length() < 1) {
                System.out.println("Press the right button");
                continue; //and repeat again
            
            }
            break; //out of the (exit) the repetition
        }
        
        return input; //return the inputin <---- you dont say?
        
    }

    private void doAction(char choice) {
            
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
            return;
            default: 
                System.out.println("\n*** Invalid selection *** Try again");
                    break;
        }
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