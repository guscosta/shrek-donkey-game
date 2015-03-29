/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.ShrekDonkeyGame.control;

import BYUI.CIT260.ShrekDonkeyGame.exceptions.GameControlException;
import BYUI.CIT260.ShrekDonkeyGame.exceptions.MapControlException;
import BYUI.CIT260.ShrekDonkeyGame.model.Actor;
import BYUI.CIT260.ShrekDonkeyGame.model.Game;
import BYUI.CIT260.ShrekDonkeyGame.model.Map;
import BYUI.CIT260.ShrekDonkeyGame.model.Player;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import shrekdonkeygame.Shrekdonkeygame;

/**
 *
 * @author hecto_000
 */
public class GameControl {

    public static void createNewGame(Player player) throws MapControlException {

        Game game = new Game(); //create new game
        Shrekdonkeygame.setCurrentGame(game); //save in shrek and donkey game

        game.setPlayer(player);

        Map map = MapControl.createMap(); //create and initialize new map
        game.setMap(map); // save map in game

        MapControl.moveActorsToStartingLocation(map); //put actors on starting loc.

    }

    public static void saveGame(Game currentGame, String filePath)
            throws GameControlException {
        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);

            output.writeObject(currentGame); // write the game object out to file
        } catch (IOException e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getSavedGame(String filePath)
            throws GameControlException {
        Game game = null;

        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream output = new ObjectInputStream(fips);

            game = (Game) output.readObject(); // read the game object from file
        } catch (FileNotFoundException fnfe) {
            throw new GameControlException(fnfe.getMessage());
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }

        // close the output file
        Shrekdonkeygame.setCurrentGame(game); // save in Shrekdonkeygame
    }

    public static void printActors(Actor[] values, String filePath)
            throws GameControlException {

        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            for (Actor characters : values)
            output.writeObject("Actors          Description          Location" 
                             + "\n" + characters + ":          " 
                             + characters.getDescription()
                             + characters.getCoordinates());
        }
        catch(IOException e) {
            throw new GameControlException(e.getMessage());
        }
    }
}
