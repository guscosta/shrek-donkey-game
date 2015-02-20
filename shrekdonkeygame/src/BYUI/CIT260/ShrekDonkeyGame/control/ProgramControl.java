package BYUI.CIT260.ShrekDonkeyGame.control;

import BYUI.CIT260.ShrekDonkeyGame.model.Player;
import shrekdonkeygame.Shrekdonkeygame;

public class ProgramControl {

    public static Player createPlayer(String name) {
       
            if (name == null) {
                return null;
            }
            Player player = new Player();
            player.setName(name);
            
            Shrekdonkeygame.setPlayer(player); //save the player
            
            return player;
    }
}
    
