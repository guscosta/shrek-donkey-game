package BYUI.CIT260.ShrekDonkeyGame.control;

import BYUI.CIT260.ShrekDonkeyGame.exceptions.MapControlException;
import BYUI.CIT260.ShrekDonkeyGame.model.Actor;
import BYUI.CIT260.ShrekDonkeyGame.model.Map;
import BYUI.CIT260.ShrekDonkeyGame.model.RegularScene;
import shrekdonkeygame.Shrekdonkeygame;

public class MapControl {

    public static Map createMap() {
        //create map
        Map map = new Map(5, 5);
        
        //create the scenes for the game
        RegularScene[] scenes = RegularScene.SceneType();
        
        //assign scenes to locations
        GameControl.assignScenesToLocations(map, scenes);
        return map;
    }

    static void moveActorsToStartingLocation(Map map) {
        // for every actor
        Actor[] actors = Actor.values();
        
        for (Actor actor : actors){
            Point coordinates = actor.getCoordinates();
            int returnValue = MapControl.moveActorToLocation(actor, coordinates);
            if (returnValue < 0) {
                return returnValue;
            }
        }
        return 0;
    }
    public static void moveActorToLocation(Actor actor, Point coordinates) 
                            throws MapControlException {
        
        Map map = Shrekdonkeygame.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if (newRow < 0 || newRow >= map.getRowCount() ||
            newColumn < 0 || newColumn >= map.getColumnCount()){
            throw new MapControlException("Can not move actor to location "
                                        +  coordinates.x + ", " + coordinates.y
                                        +  " because that location is outside "
                                        +  " the bounds of the map.");
        }
        
    }
}
