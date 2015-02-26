package BYUI.CIT260.ShrekDonkeyGame.view;

import BYUI.CIT260.ShrekDonkeyGame.control.ShrekStateControl;
import BYUI.CIT260.ShrekDonkeyGame.model.Phrase;
import java.util.Scanner;

public class PhraseView {

            private final String PHRASECHOICE = "\n"
                +"\n-------------------------------------------------"
                +"\n| Choose a phrase to say                        |"
                +"\n-------------------------------------------------"
                +"\n1 - Everybody likes parfait!"
                +"\n2 - So... want a waffle?"
                +"\n3 - Ain't nobody got anything on my friend Shrek!"
                +"\n4 - it's ok i like onions and cakes"
                +"\nE - Exit"
                +"\n-------------------------------------------------";

    //these are the choices of phrases that will be given in a part of the game       
    public void phraseSelection() {
        
        char selection = ' ';
        do {
            System.out.println(PHRASECHOICE); //displays the choices
            
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
            
            //if the name is invalid (less than 1 characters in length)
            if (input.length() < 1) {
                System.out.println("Press the right button");
                continue; //and repeat again
            
            }
            break; //out of the (exit) the repetition
        }
        
        return input; //return the inputin <---- you dont say?
        
        }

    private void doAction(char choice) {
        Phrase phrase = new Phrase();
        phrase.setAngerValue(0);
        phrase.setHappinessValue(2);
        phrase.setPhraseType("a");
        phrase.setPhraseValue(2);
        switch (choice) {
            case '1': //choose phrase 1
                this.getPhraseOne(phrase);
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
            return;
            default: 
                System.out.println("\n*** Invalid selection *** Try again");
                    break;
        }
    }
    
    public void getPhraseOne(Phrase phrase) {
        System.out.println("you have successfully annoyed shrek!");
        ShrekStateControl.calcShrekState(phrase);
             
    }

    private void getPhraseTwo() {
        System.out.println("you have successfully annoyed shrek AND he slapped you in the face");
    }

    private void getPhraseThree() {
        System.out.println("somehow shrek feels nicer around you");
    }

    private void getPhraseFour() {
        System.out.println("shrek kinda likes what youre saying");
    }
}