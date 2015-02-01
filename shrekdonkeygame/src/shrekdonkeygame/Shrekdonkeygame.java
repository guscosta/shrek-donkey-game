package shrekdonkeygame;

import BYUI.CIT260.ShrekDonkeyGame.model.Actor;
import BYUI.CIT260.ShrekDonkeyGame.model.Donkey;
import BYUI.CIT260.ShrekDonkeyGame.model.Game;
import BYUI.CIT260.ShrekDonkeyGame.model.Phrase;
import BYUI.CIT260.ShrekDonkeyGame.model.Player;

public class Shrekdonkeygame {
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Pedro Picapiedra");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Game gameOne = new Game();
        
        gameOne.setTime(15.00);
        gameOne.setWinner("Simba");
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        Actor actorOne = new Actor();
        
        actorOne.setName("Donkey");
        
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
        
        Phrase phraseOne = new Phrase();
        
        phraseOne.setPhraseType("Friendly");
        phraseOne.setMessage("You are a good friend");
        
        String phraseInfo = phraseOne.toString();
        System.out.println(phraseInfo);
        
        Donkey donkeyKick = new Donkey();
        
        donkeyKick.setKick(1000);
        
        String donkeyInfo = donkeyKick.toString();
        System.out.println(donkeyInfo);        
    }
    
}