package shrekdonkeygame;

import BYUI.CIT260.ShrekDonkeyGame.model.Actor;
import BYUI.CIT260.ShrekDonkeyGame.model.Donkey;
import BYUI.CIT260.ShrekDonkeyGame.model.EnemyScene;
import BYUI.CIT260.ShrekDonkeyGame.model.Game;
import BYUI.CIT260.ShrekDonkeyGame.model.Location;
import BYUI.CIT260.ShrekDonkeyGame.model.Map;
import BYUI.CIT260.ShrekDonkeyGame.model.Phrase;
import BYUI.CIT260.ShrekDonkeyGame.model.Player;
import BYUI.CIT260.ShrekDonkeyGame.model.RegularScene;

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
        
        Map mapOne = new Map();
        
        mapOne.setColumnCount(10);
        mapOne.setRowCount(5);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
        Location locationOne = new Location();
        
        locationOne.setRow(14);
        locationOne.setColumn(3);
        locationOne.setVisited(true);
        locationOne.setAmountRemaining(30);
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
        RegularScene regSceneOne = new RegularScene();
        
        regSceneOne.setDescription("robin hood doing the jig");
        
        String regSceneInfo = regSceneOne.toString();
        System.out.println(regSceneInfo);
        
        EnemyScene eneSceneOne = new EnemyScene();
        
        eneSceneOne.setName("farquad being a jerk");
        
        String eneSceneInfo = eneSceneOne.toString();
        System.out.println(eneSceneInfo);
        
     }
}