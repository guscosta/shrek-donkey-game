package BYUI.CIT260.ShrekDonkeyGame.model;

import java.io.Serializable;
import java.util.Objects;

//this translates the data in the class into a format so it can be stored in
//disk or sent acrss the network
public class Phrase implements Serializable{
    
    public static Phrase[] createPhraseList() {
        Phrase[] phrase = new Phrase[10];
        
        Phrase onion = new Phrase();
        onion.setMessage("onions make people cry!");
        onion.setPhraseType('a');
        phrase[0] = onion;
        
        Phrase cake = new Phrase();
        cake.setMessage("cakes have layers everybody loves cakes!");
        cake.setPhraseType('a');
        cake.setPhraseValue(1);
        phrase[1] = cake;
        
        Phrase friend = new Phrase();
        friend.setMessage("but i'm your friend right?");
        friend.setPhraseType('h');
        friend.setPhraseValue(2);
        phrase[2] = friend;
        
        Phrase breath = new Phrase();
        breath.setMessage("your breath smells like onions, does you breath have layers too?");
        breath.setPhraseType('a');
        breath.setPhraseValue(2);
        phrase[3] = breath;
        
        Phrase waffles = new Phrase();
        waffles.setMessage("and in the morning, i'll make you waffles!");
        waffles.setPhraseType('a');
        waffles.setPhraseValue(1);
        phrase[4] = onion;
        
        Phrase green  = new Phrase();
        green.setMessage("i like green its a pretty color.");
        green.setPhraseType('h');
        green.setPhraseValue(2);
        phrase[5] = green;
        
        Phrase cliche  = new Phrase();
        cliche.setMessage("you've got a friend in me.");
        cliche.setPhraseType('h');
        cliche.setPhraseValue(1);
        phrase[6] = cliche;
        
        Phrase lemons  = new Phrase();
        lemons.setMessage("when life gives you lemons you make key lemon pie.");
        lemons.setPhraseType('a');
        lemons.setPhraseValue(1);
        phrase[7] = lemons;
        
        Phrase joke  = new Phrase();
        joke.setMessage("what's the difference between a poodle and a doodle? scaboodle!");
        joke.setPhraseType('h');
        joke.setPhraseValue(2);
        phrase[8] = joke;
     
        return phrase;
    }
    
    //Class instance variables
    private char phraseType;
    private String message;
    private double phraseValue;
    private double angerValue;
    private double happinessValue;
    
    private String actor;
    
    public Phrase() {
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public char getPhraseType() {
        return phraseType;
    }

    public void setPhraseType(char phraseType) {
        this.phraseType = phraseType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getPhraseValue() {
        return phraseValue;
    }

    public void setPhraseValue(double phraseValue) {
        this.phraseValue = phraseValue;
    }

    public double getAngerValue() {
        return angerValue;
    }

    public void setAngerValue(double angerValue) {
        this.angerValue = angerValue;
    }

    public double getHappinessValue() {
        return happinessValue;
    }

    public void setHappinessValue(double happinessValue) {
        this.happinessValue = happinessValue;
    }

    @Override
    public String toString() {
        return "Phrase{" + "phraseType=" + phraseType + ", message=" + message + ", phraseValue=" + phraseValue + ", angerValue=" + angerValue + ", happinessValue=" + happinessValue + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.phraseType);
        hash = 59 * hash + Objects.hashCode(this.message);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.phraseValue) ^ (Double.doubleToLongBits(this.phraseValue) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.angerValue) ^ (Double.doubleToLongBits(this.angerValue) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.happinessValue) ^ (Double.doubleToLongBits(this.happinessValue) >>> 32));
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
        final Phrase other = (Phrase) obj;
        if (!Objects.equals(this.phraseType, other.phraseType)) {
            return false;
        }
        if (!Objects.equals(this.message, other.message)) {
            return false;
        }
        if (Double.doubleToLongBits(this.phraseValue) != Double.doubleToLongBits(other.phraseValue)) {
            return false;
        }
        if (Double.doubleToLongBits(this.angerValue) != Double.doubleToLongBits(other.angerValue)) {
            return false;
        }
        if (Double.doubleToLongBits(this.happinessValue) != Double.doubleToLongBits(other.happinessValue)) {
            return false;
        }
        return true;
    }

  
}
