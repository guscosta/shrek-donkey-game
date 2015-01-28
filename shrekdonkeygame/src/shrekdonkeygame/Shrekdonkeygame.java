package shrekdonkeygame;

import BYUI.CIT260.ShrekDonkeyGame.model.Player;

public class Shrekdonkeygame {
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Pedro Picapiedra");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
    }
    
}