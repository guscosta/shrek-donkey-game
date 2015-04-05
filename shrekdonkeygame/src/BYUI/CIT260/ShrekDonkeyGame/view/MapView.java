/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.ShrekDonkeyGame.view;

import BYUI.CIT260.ShrekDonkeyGame.model.Location;
import shrekdonkeygame.Shrekdonkeygame;

public class MapView extends View {

    public MapView(String promptMessage) {
        super("MAP"
                + "\n 1  2  3  4  5 ");
    }

    public void displayMap() {

        Location[][] locations = Shrekdonkeygame.getCurrentGame().getMap().getLocations();
        this.console.println("MAP" 
                + "\n 1  2  3  4  5 ");
        for (int i = 0; i < locations.length; i++) {
            this.console.println(" - ");
            this.console.println(i + 1);

            for (int j = 0; j < locations[i].length; j++) {
                this.console.println(" | ");
                Location location = locations[i][j];
                if (location.isVisited()) {
                    this.console.println("V");
                } else {
                    this.console.println(" ?? ");
                }
            }

            this.console.println(" | ");
        }

        this.console.println(" - ");
    }

    @Override
    public boolean doAction(Object obj) {
        this.console.println("That is the map.");
        return true;
    }

}
