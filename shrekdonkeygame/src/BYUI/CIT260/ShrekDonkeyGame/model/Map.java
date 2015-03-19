package BYUI.CIT260.ShrekDonkeyGame.model;

import java.awt.image.BufferedImage;
import java.io.Serializable;
import shrekdonkeygame.Shrekdonkeygame;
import BYUI.CIT260.ShrekDonkeyGame.model.RegularScene.SceneType;

public class Map implements Serializable {
    
    private int rowCount;
    private int columnCount;
    private Location[][] locations;
    
    private Game[] game;

    public Map(int rowCount, int columnCount) {
        
        this.rowCount = 5;
        this.columnCount = 5;
        
        if (rowCount < 1 || columnCount < 1) {
            System.out.println("The number of columns and rows must be > zero");
            return;
        }
        
        //create a 2d array or Location objects
        this.locations = new Location[rowCount][columnCount];
        
        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                //create and initialize new Location object instance
                Location location = new Location();
                location.setColumn(columnCount);
                location.setRow(rowCount);
                location.setVisited(false);
                
                //assign the Location object to the current position in array
                locations[row][column] = location;
            }
        }
    }
    
    private static RegularScene[] createScenes() {
        BufferedImage image = null;
        
        Game game = Shrekdonkeygame.getCurrentGame();
        
        RegularScene[] scenes = new RegularScene[SceneType.values().length];
        
        RegularScene startingScene = new RegularScene();
        startingScene.setDescription(
                "\nShrek and donkey have just been tasked with rescuing "
                + "Fiona from the powerful dragon! "
                + "begin your journey oh mighty steed and help Shrek rescue the princess.");
        startingScene.setMapSymbol(" ST ");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        //ImageIcon startingSceneImage = MapControl.getImage(startingScene, "trollololol");
        //startingScene.setIcon(startingSceneImage);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        RegularScene bonfire = new RegularScene();
        bonfire.setDescription(
                "\nYou are now resting before going to the castle to rescue Fiona");
        bonfire.setMapSymbol(" BF ");
        bonfire.setBlocked(false);
        bonfire.setTravelTime(240);
        //ImageIcon startingSceneImage = MapControl.getImage(startingScene, "trollololol");
        //startingScene.setIcon(startingSceneImage);
        scenes[SceneType.bonfire.ordinal()] = bonfire;
        
        RegularScene rocks = new RegularScene();
        rocks.setDescription(
                "\nYou are approaching the castle, and it smells like brimstone.");
        rocks.setMapSymbol(" RK ");
        rocks.setBlocked(false);
        rocks.setTravelTime(240);
        //ImageIcon startingSceneImage = MapControl.getImage(startingScene, "trollololol");
        //startingScene.setIcon(startingSceneImage);
        scenes[SceneType.rocks.ordinal()] = rocks;
        
        RegularScene bridge = new RegularScene();
        bridge.setDescription(
                "\nBe careful Shrek might just make you fall off the bridge!");
        bridge.setMapSymbol(" BG ");
        bridge.setBlocked(false);
        bridge.setTravelTime(240);
        //ImageIcon startingSceneImage = MapControl.getImage(startingScene, "trollololol");
        //startingScene.setIcon(startingSceneImage);
        scenes[SceneType.bridge.ordinal()] = bridge;
        
        RegularScene stars = new RegularScene();
        stars.setDescription(
                "\nThis is a good moment to talk to Shrek, and make him feel good about himself.");
        stars.setMapSymbol(" SA ");
        stars.setBlocked(false);
        stars.setTravelTime(240);
        //ImageIcon startingSceneImage = MapControl.getImage(startingScene, "trollololol");
        //startingScene.setIcon(startingSceneImage);
        scenes[SceneType.stars.ordinal()] = stars;
        
        RegularScene field = new RegularScene();
        field.setDescription(
                "\nThere are a lot of things to eat here. Shrek is comparing himself to an onion.");
        field.setMapSymbol(" FD ");
        field.setBlocked(false);
        field.setTravelTime(240);
        //ImageIcon startingSceneImage = MapControl.getImage(startingScene, "trollololol");
        //startingScene.setIcon(startingSceneImage);
        scenes[SceneType.field.ordinal()] = field;
        
        RegularScene castle = new RegularScene();
        castle.setDescription(
                "\nBe ready to encounter all of the Farquad's guards.");
        castle.setMapSymbol(" CT ");
        castle.setBlocked(false);
        castle.setTravelTime(240);
        //ImageIcon startingSceneImage = MapControl.getImage(startingScene, "trollololol");
        //startingScene.setIcon(startingSceneImage);
        scenes[SceneType.castle.ordinal()] = castle;
        
        RegularScene love = new RegularScene();
        love.setDescription(
                "\nShrek and Fiona look like they are falling in love!");
        love.setMapSymbol(" LV ");
        love.setBlocked(false);
        love.setTravelTime(240);
        //ImageIcon startingSceneImage = MapControl.getImage(startingScene, "trollololol");
        //startingScene.setIcon(startingSceneImage);
        scenes[SceneType.love.ordinal()] = love;
        
        RegularScene food = new RegularScene();
        food.setDescription(
                "\nShrek and Fiona are getting some food.");
        food.setMapSymbol(" FO ");
        food.setBlocked(false);
        food.setTravelTime(240);
        //ImageIcon startingSceneImage = MapControl.getImage(startingScene, "trollololol");
        //startingScene.setIcon(startingSceneImage);
        scenes[SceneType.food.ordinal()] = food;
        
        RegularScene arrow = new RegularScene();
        arrow.setDescription(
                "\nYou have to help Shrek get the arrow off of his butt!");
        arrow.setMapSymbol(" AR ");
        arrow.setBlocked(false);
        arrow.setTravelTime(240);
        //ImageIcon startingSceneImage = MapControl.getImage(startingScene, "trollololol");
        //startingScene.setIcon(startingSceneImage);
        scenes[SceneType.arrow.ordinal()] = arrow;
        
        RegularScene duloc = new RegularScene();
        duloc.setDescription(
                "\nBe ready to encounter all of the Farquad's guards.");
        duloc.setMapSymbol(" DC ");
        duloc.setBlocked(false);
        duloc.setTravelTime(240);
        //ImageIcon startingSceneImage = MapControl.getImage(startingScene, "trollololol");
        //startingScene.setIcon(startingSceneImage);
        scenes[SceneType.duloc.ordinal()] = duloc;
        
        RegularScene rats = new RegularScene();
        rats.setDescription(
                "\nShrek and Fiona are eating rats, and it seems the atmosphere is romantic.");
        rats.setMapSymbol(" RT ");
        rats.setBlocked(false);
        rats.setTravelTime(240);
        //ImageIcon startingSceneImage = MapControl.getImage(startingScene, "trollololol");
        //startingScene.setIcon(startingSceneImage);
        scenes[SceneType.rats.ordinal()] = rats;
        
        RegularScene ogre = new RegularScene();
        ogre.setDescription(
                "\nYou are scared out of your mind, has a female ogre eaten Princess Fiona?");
        ogre.setMapSymbol(" OG ");
        ogre.setBlocked(false);
        ogre.setTravelTime(240);
        //ImageIcon startingSceneImage = MapControl.getImage(startingScene, "trollololol");
        //startingScene.setIcon(startingSceneImage);
        scenes[SceneType.ogre.ordinal()] = ogre;
        
        RegularScene wall = new RegularScene();
        wall.setDescription(
                "\nAngry about the situation you are thinking of dividing Shrek swamp so that you can live in half of it.");
        wall.setMapSymbol(" WL ");
        wall.setBlocked(false);
        wall.setTravelTime(240);
        //ImageIcon startingSceneImage = MapControl.getImage(startingScene, "trollololol");
        //startingScene.setIcon(startingSceneImage);
        scenes[SceneType.wall.ordinal()] = wall;
        
        RegularScene argument = new RegularScene();
        argument.setDescription(
                "\nNow you are in an argument with Shrek.");
        argument.setMapSymbol(" AT ");
        argument.setBlocked(false);
        argument.setTravelTime(240);
        //ImageIcon startingSceneImage = MapControl.getImage(startingScene, "trollololol");
        //startingScene.setIcon(startingSceneImage);
        scenes[SceneType.argument.ordinal()] = argument;
        
        RegularScene finishScene = new RegularScene();
        finishScene.setDescription(
            "/nCongratulations you saved Fiona and had Shrek marry her "
          + "you all live happily ever after.");
        
        finishScene.setMapSymbol(" FN ");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        //ImageIcon finishSceneImage = MapControl.getImage(finishScene,
        //        "trololololollololol");
        //    finishScene.setIcon(finishSceneImage);
        scenes[SceneType.finish.ordinal()] = finishScene;
        return null;
    }
    
    private static void assignScenesToLocations(Map map, RegularScene[] scenes) {
        Location[][] locations = map.getLocations();
        
        //start point
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.bonfire.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.castle.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.castle.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.castle.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.bonfire.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.stars.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.woods.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.woods.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.woods.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.arrow.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.woods.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.love.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.love.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.love.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.rats.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.rats.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.ogre.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.ogre.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.ogre.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.swamp.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.swamp.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.woods.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.field.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.field.ordinal()]);
        locations[5][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[5][1].setScene(scenes[SceneType.woods.ordinal()]);
        locations[5][2].setScene(scenes[SceneType.woods.ordinal()]);
        locations[5][3].setScene(scenes[SceneType.field.ordinal()]);
        locations[5][4].setScene(scenes[SceneType.field.ordinal()]);
        
    }
    public int getLocations(Location[][] locations) {
            
            System.out.println("MAP");
            System.out.println(" 1  2  3  4  5 ");
                for (int i = 0; i < locations.length; i++) {
                    System.out.println(" - ");
                    System.out.println(rowCount);
            
                    for (int j = 0; j < columnCount; j++) {
                        System.out.println(" | ");
                            if(Location = true){
                                System.out.println("V");
                            }        
                            else 
                                System.out.println(" ?? ");{
                            }
                    }
                }
                
    }
    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public Game[] getGame() {
        return game;
    }

    public void setGame(Game[] game) {
        this.game = game;
    }
    

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int RowCount) {
        this.rowCount = RowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int ColumnCount) {
        this.columnCount = ColumnCount;
    }

    @Override
    public String toString() {
        return "Map{" + "RowCount=" + rowCount + ", ColumnCount=" + columnCount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + this.rowCount;
        hash = 73 * hash + this.columnCount;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        return true;
    }

}
