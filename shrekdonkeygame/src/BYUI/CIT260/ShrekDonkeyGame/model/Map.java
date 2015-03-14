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
        
        if (rowCount < 1 || columnCount < 1) {
            System.out.println("The number of columns and rows must be > zero");
            return;
        }
        
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        
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
        locations[0][1].setScene(scenes[SceneType.woods.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.woods.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.field.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.field.ordinal()]);
        
    }
    /**public int getLocations(int[][] locations) {
            
            System.out.println("MAP");
            System.out.println(" 1  2  3  4  5 ");
                for (int i = 0; i < locations.length; i++) {
                    System.out.println(" | ");
                    System.out.println(rowCount);
            
                    for (int j = 0; j < columnCount; j++) {
                        System.out.println(" | ");
                        locations = locations[i][j];
                            if(locations = "visited");
                            System.out.println("V");
                            else System.out.println(" ?? ");
                    
                                
                    }
                }
    }**/
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
