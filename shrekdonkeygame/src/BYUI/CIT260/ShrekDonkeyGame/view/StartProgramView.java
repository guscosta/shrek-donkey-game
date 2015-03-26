package BYUI.CIT260.ShrekDonkeyGame.view;

import BYUI.CIT260.ShrekDonkeyGame.control.ProgramControl;
import BYUI.CIT260.ShrekDonkeyGame.model.Player;
import java.util.Scanner;

public class StartProgramView extends View {

    public StartProgramView(String promptMessage) {
        super("\n\n***********************************************************"
                + "*                                                          *"
                + "\n* This is the game of Shrek and Donkey                     *"
                + "\n* In this game you will be taking on the role of Donkey    *"
                + "\n* As Donkey you will try to help Shrek save Princess Fiona *"
                + "\n* You will be able to influence Shrek's mood               *"
                + "\n* by being friendly or annoying                            *"
                + "\n* you will also be able to kick bad guys and do puzzles.   *"
                + "                                                           *"
                + "\n* Good luck and have fun in this adventure.                *"
                + "\n*                                                          *"
                + "***************************************************************"
                + "\n\nPlease enter you name: ");
    }

    public void displayWelcomeMessage(Player player) {
        this.console.println("\n\n============================================");
        this.console.println("\twelcome to the jungle " + player.getName());
        this.console.println("\twe got fun and games!");
        this.console.println("==============================================");
    }

    @Override
    public boolean doAction(Object obj) {

        //prompt player to enter his name and retrieve the name of the player
        String playersName = (String) obj;
        //create and save the player object
        Player player = ProgramControl.createPlayer(playersName);
        //display a personalized welcome message
        this.displayWelcomeMessage(player);
        //display the main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();

        return true;
    }

}
