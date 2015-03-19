package BYUI.CIT260.ShrekDonkeyGame.control;

import BYUI.CIT260.ShrekDonkeyGame.exceptions.MapControlException;
import BYUI.CIT260.ShrekDonkeyGame.model.Actor;
import BYUI.CIT260.ShrekDonkeyGame.model.Location;
import BYUI.CIT260.ShrekDonkeyGame.model.Map;
import BYUI.CIT260.ShrekDonkeyGame.model.RegularScene;
import shrekdonkeygame.Shrekdonkeygame;

public class MapControl {

    public static Map createMap() {
        //create map
        Map map = new Map(5, 5);

        //create the scenes for the game
        RegularScene[] scenes = new RegularScene[RegularScene.SceneType.values().length];

        //assign scenes to locations
        assignScenesToLocations(map, scenes);
        return map;
    }
    
    private static void assignScenesToLocations(Map map, RegularScene[] scenes) {
        Location[][] locations = map.getLocations();
        
        //start point
        locations[0][0].setScene(scenes[RegularScene.SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[RegularScene.SceneType.bonfire.ordinal()]);
        locations[0][2].setScene(scenes[RegularScene.SceneType.castle.ordinal()]);
        locations[0][3].setScene(scenes[RegularScene.SceneType.castle.ordinal()]);
        locations[0][4].setScene(scenes[RegularScene.SceneType.castle.ordinal()]);
        locations[1][0].setScene(scenes[RegularScene.SceneType.bonfire.ordinal()]);
        locations[1][1].setScene(scenes[RegularScene.SceneType.stars.ordinal()]);
        locations[1][2].setScene(scenes[RegularScene.SceneType.woods.ordinal()]);
        locations[1][3].setScene(scenes[RegularScene.SceneType.woods.ordinal()]);
        locations[1][4].setScene(scenes[RegularScene.SceneType.woods.ordinal()]);
        locations[2][0].setScene(scenes[RegularScene.SceneType.arrow.ordinal()]);
        locations[2][1].setScene(scenes[RegularScene.SceneType.woods.ordinal()]);
        locations[2][2].setScene(scenes[RegularScene.SceneType.love.ordinal()]);
        locations[2][3].setScene(scenes[RegularScene.SceneType.love.ordinal()]);
        locations[2][4].setScene(scenes[RegularScene.SceneType.love.ordinal()]);
        locations[3][0].setScene(scenes[RegularScene.SceneType.rats.ordinal()]);
        locations[3][1].setScene(scenes[RegularScene.SceneType.rats.ordinal()]);
        locations[3][2].setScene(scenes[RegularScene.SceneType.ogre.ordinal()]);
        locations[3][3].setScene(scenes[RegularScene.SceneType.ogre.ordinal()]);
        locations[3][4].setScene(scenes[RegularScene.SceneType.ogre.ordinal()]);
        locations[4][0].setScene(scenes[RegularScene.SceneType.swamp.ordinal()]);
        locations[4][1].setScene(scenes[RegularScene.SceneType.swamp.ordinal()]);
        locations[4][2].setScene(scenes[RegularScene.SceneType.woods.ordinal()]);
        locations[4][3].setScene(scenes[RegularScene.SceneType.field.ordinal()]);
        locations[4][4].setScene(scenes[RegularScene.SceneType.field.ordinal()]);
        locations[5][0].setScene(scenes[RegularScene.SceneType.start.ordinal()]);
        locations[5][1].setScene(scenes[RegularScene.SceneType.woods.ordinal()]);
        locations[5][2].setScene(scenes[RegularScene.SceneType.woods.ordinal()]);
        locations[5][3].setScene(scenes[RegularScene.SceneType.field.ordinal()]);
        locations[5][4].setScene(scenes[RegularScene.SceneType.field.ordinal()]);
        
    }

    static void moveActorsToStartingLocation(Map map) {
        // for every actor
        Actor[] actors = Actor.values();

        for (Actor actor : actors) {
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
        int newRow = coordinates.x - 1;
        int newColumn = coordinates.y - 1;

        if (newRow < 0 || newRow >= map.getRowCount()
                || newColumn < 0 || newColumn >= map.getColumnCount()) {
            throw new MapControlException("Can not move actor to location "
                    + coordinates.x + ", " + coordinates.y
                    + " because that location is outside "
                    + " the bounds of the map.");
        }

    }
}
