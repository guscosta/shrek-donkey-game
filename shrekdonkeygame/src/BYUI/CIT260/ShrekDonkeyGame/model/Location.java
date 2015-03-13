package BYUI.CIT260.ShrekDonkeyGame.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Location implements Serializable {
    
    private int row;
    private int column;
    private boolean Visited;
    private int AmountRemaining;
    private RegularScene scene;
    private ArrayList<Actor> actors;

    public RegularScene getScene() {
        return scene;
    }

    public void setScene(RegularScene scene) {
        this.scene = scene;
    }
    
    public Location() {
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isVisited() {
        return Visited;
    }

    public void setVisited(boolean Visited) {
        this.Visited = Visited;
    }

    public int getAmountRemaining() {
        return AmountRemaining;
    }

    public void setAmountRemaining(int AmountRemaining) {
        this.AmountRemaining = AmountRemaining;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", Visited=" + Visited + ", AmountRemaining=" + AmountRemaining + ", scene=" + scene + ", actors=" + actors + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.row;
        hash = 59 * hash + this.column;
        hash = 59 * hash + (this.Visited ? 1 : 0);
        hash = 59 * hash + this.AmountRemaining;
        hash = 59 * hash + Objects.hashCode(this.scene);
        hash = 59 * hash + Objects.hashCode(this.actors);
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.Visited != other.Visited) {
            return false;
        }
        if (this.AmountRemaining != other.AmountRemaining) {
            return false;
        }
        if (!Objects.equals(this.scene, other.scene)) {
            return false;
        }
        if (!Objects.equals(this.actors, other.actors)) {
            return false;
        }
        return true;
    }

   
}