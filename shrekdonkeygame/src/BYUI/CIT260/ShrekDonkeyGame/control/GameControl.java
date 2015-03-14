/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.ShrekDonkeyGame.control;

import BYUI.CIT260.ShrekDonkeyGame.model.Player;

/**
 *
 * @author hecto_000
 */
public class GameControl {

    public static void createNewGame(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**public static void createNewGame(Player player) {
        
        Game game = new Game(); //create new game
        Shrekdonkeygame.setCurrentGame(game); //save in shrek and donkey game
        
        game.setPlayer(player);
        
        Map map = MapControl.createMap(); //create and initialize new map
        game.setMap(map); // save map in game
        
        MapControl.moveActorsToStartingLocation(map); //put actors on starting loc.
        
    }

    static void assignScenesToLocations(Map map, RegularScene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }**/
    
}
