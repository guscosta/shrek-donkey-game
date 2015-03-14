package BYUI.CIT260.ShrekDonkeyGame.model;

import java.io.Serializable;
import java.util.Objects;

//this translates the data in the class into a format so it can be stored in
//disk or sent acrss the network
public class Phrase implements Serializable{
    
    public static PhraseList[] createPhraseList() {
        PhraseList[] onion = new PhraseList[15];
        
        PhraseList onion = new PhraseList();
        onion.setMessage("onions make people cry!");
        onion.setPhraseType('a');
        onion.setPhraseValue(2);
        phrase[0] = onion;
        
        PhraseList[] cake = new PhraseList();
        cake.setMessage("cakes have layers everybody loves cakes!");
        cake.setPhraseType('a');
        cake.setPhraseValue(1);
        phrase[1] = cake;
        
        PhraseList[] friend = new PhraseList();
        friend.setMessage("but i'm your friend right?");
        friend.setPhraseType('h');
        friend.setPhraseValue(2);
        phrase[2] = friend;
        
        PhraseList[] breath = new PhraseList();
        breath.setMessage("your breath smells like onions, does you breath have layers too?");
        breath.setPhraseType('a');
        breath.setPhraseValue(2);
        phrase[3] = breath;
        
        PhraseList[] waffles = new PhraseList();
        waffles.setMessage("and in the morning, i'll make you waffles!");
        waffles.setPhraseType('a');
        waffles.setPhraseValue(1);
        phrase[4] = onion;
        
        PhraseList[]  = new PhraseList();
        onion.setMessage("onions make people cry!");
        onion.setPhraseType('a');
        onion.setPhraseValue(2);
        phrase[0] = onion;
            
                    }
    
    //Class instance variables
    private String phraseType;
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

    public String getPhraseType() {
        return phraseType;
    }

    public void setPhraseType(String phraseType) {
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
