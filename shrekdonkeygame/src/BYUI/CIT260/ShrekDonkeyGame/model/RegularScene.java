package BYUI.CIT260.ShrekDonkeyGame.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class RegularScene implements Serializable {
    private String description;
    private String mapSymbol;
    private Boolean blocked;
    private double travelTime;
    private Enemy enemy;
    
    public enum SceneType {
        
        start,
        woods,
        swamp,
        bonfire,
        rocks,
        bridge,
        stars,
        love,
        food,
        arrow,
        rats,
        ogre,
        wall,
        argument,
        field,
        castle,
        duloc,
        finish,
    }
    
    private String location[]; //<--- what datatype should this be?

    public RegularScene() {
    }

    public String[] getLocation() {
        return location;
    }

    public void setLocation(String[] location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    public Boolean getBlocked() {
        return blocked;
    }

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }
    

    @Override
    public String toString() {
        return "RegularScene{" + "description=" + description + ", mapSymbol=" + mapSymbol + ", blocked=" + blocked + ", travelTime=" + travelTime + ", location=" + location + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + Objects.hashCode(this.mapSymbol);
        hash = 97 * hash + Objects.hashCode(this.blocked);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        hash = 97 * hash + Arrays.deepHashCode(this.location);
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
        final RegularScene other = (RegularScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.mapSymbol, other.mapSymbol)) {
            return false;
        }
        if (!Objects.equals(this.blocked, other.blocked)) {
            return false;
        }
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        if (!Arrays.deepEquals(this.location, other.location)) {
            return false;
        }
        return true;
    }

    
    
    

    
}
