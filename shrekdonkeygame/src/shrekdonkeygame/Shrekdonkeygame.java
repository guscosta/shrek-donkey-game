package shrekdonkeygame;

import BYUI.CIT260.ShrekDonkeyGame.model.Actor;
import BYUI.CIT260.ShrekDonkeyGame.model.Donkey;
import BYUI.CIT260.ShrekDonkeyGame.model.EnemyScene;
import BYUI.CIT260.ShrekDonkeyGame.model.Game;
import BYUI.CIT260.ShrekDonkeyGame.model.Location;
import BYUI.CIT260.ShrekDonkeyGame.model.Map;
import BYUI.CIT260.ShrekDonkeyGame.model.Phrase;
import BYUI.CIT260.ShrekDonkeyGame.model.Player;
import BYUI.CIT260.ShrekDonkeyGame.model.PuzzleScene;
import BYUI.CIT260.ShrekDonkeyGame.model.RegularScene;
import BYUI.CIT260.ShrekDonkeyGame.model.Shrek;
import BYUI.CIT260.ShrekDonkeyGame.view.StartProgramView;

public class Shrekdonkeygame {
            
    private static Game currentGame = null;
    private static Player player = null;

    public static void main(String[] args) {
        
        //create StartProgramView and start the program
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
    }   

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Shrekdonkeygame.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Shrekdonkeygame.player = player;
    }
}