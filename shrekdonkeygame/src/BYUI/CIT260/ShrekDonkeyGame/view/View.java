/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.ShrekDonkeyGame.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import shrekdonkeygame.Shrekdonkeygame;

public abstract class View implements ViewInterface {

    private String promptMessage;

    protected final BufferedReader keyboard = Shrekdonkeygame.getInFile();
    protected final PrintWriter console = Shrekdonkeygame.getOutFile();

    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    @Override
    public void display() {

        String value;

        do {
            System.out.println(this.promptMessage); //displays the menu again

            value = this.getInput(); //get the user's selection
            this.doAction(value); //get the first character of string

        } while (!value.equals('E')); //a selection is not Exit        

        boolean done = false;

        do {
            System.out.println(this.promptMessage); //displays the menu again

            value = this.getInput(); //get the user's selection
            done = this.doAction(value);
        } while (!done); //a selection is not Exit        

    }

    public String getInput() {
        boolean valid = false; //indicate if the input has been retrieved
        String selection = null;
        try {
            //while a valid input has not been retrieved
            while (!valid) {

                //prompt for the player's choice
                System.out.println("\t\nEnter your selection below:");

                //get the input from the keyboard and trim off the blanks
                selection = this.keyboard.readLine();
                selection = selection.trim();

                //if the name is invalid (less than 2 characters in length)
                if (selection.length() < 1) {
                    System.out.println("\n*** Invalid selection *** Try again");
                    continue; //and repeat again
                }
                break; //out of the (exit) the repetition
            }
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
        return selection; //return the input

    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String message) {
        this.promptMessage = message;
    }

}
