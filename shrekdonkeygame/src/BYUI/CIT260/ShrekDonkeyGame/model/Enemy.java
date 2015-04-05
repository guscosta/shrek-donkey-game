package BYUI.CIT260.ShrekDonkeyGame.model;

import java.io.Serializable;

public enum Enemy implements Serializable {

    LordFarquaad("He is the short guy that will soon to be king of Duloc.", 40),
    RobinHood("This is a very annoying guy that thinks Shrek kidnapped Fiona", 65),
    Dragon("This is a big pink female dragon", 500),
    MagicMirror("A mirror that talks", 50),
    AngryMob("Mob of people who do not like Shrek", 200),
    Guards("These guards are no match for Shrek", 200);

    private final String description;
    private final double enemyWeight;

    private Enemy(String description, double enemyWeight) {
        this.description = description;
        this.enemyWeight = enemyWeight;
    }

    public String getDescription() {
        return description;
    }

    public double getEnemyWeight() {
        return enemyWeight;
    }
    
    
}
