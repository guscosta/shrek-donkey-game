/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.ShrekDonkeyGame.model;

import java.awt.Point;
import java.io.Serializable;
/**
 *
 * @author hecto_000
 */

    
// Allows that all of the data stored in class instance variables in a class
// to be translated into a format so that it can be stored on disk or sent
// across the network
public enum Actor implements Serializable{
    
    Shrek("He is a big ogre who lives by himself and everyone fears him."),
    Donkey("He is a talking donkey who wants to be Shrek's friend."),
    Fiona("She is a princess locked away in a tower guarded by a dragon."),
    Gingy("He is a gingerbread man and one of Shrek´s friends."),
    Pinochio("He is a kid that is made of wood. If he lies his nose wil grow."),
    ThreeLittlePigs("These pigs can fight!"),
    BigBadWolf("He likes to eat pigs and dress as a granda."),
    ThreeBlindMice("These mice are blind.");
    
    
    
    private final String description;
    private final Point coordinates;

    private Location location;
    private Game[] game;
    private String phrase[];

    Actor(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Game[] getGame() {
        return game;
    }

    public void setGame(Game[] game) {
        this.game = game;
    }

    public String[] getPhrase() {
        return phrase;
    }

    public void setPhrase(String[] phrase) {
        this.phrase = phrase;
    }  
    
    public String getDescription() {
        return description;
    }
    
    public Point getCoordinates() {
        return coordinates;
    }
    
    public static Actor[] sortActors(){
    
        Actor[] actors = Actor.values();
        int j;
        boolean flag = true;
        String temp;
        
        
        return actors;
    }

    private static class values {

        public values() {
        }
    }
}
