/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.ShrekDonkeyGame.view;

import BYUI.CIT260.ShrekDonkeyGame.model.Location;
import shrekdonkeygame.Shrekdonkeygame;

/**
 *
 * @author hecto_000
 */
public class MapView {

    public void displayMap() {

        Location[][] locations = Shrekdonkeygame.getCurrentGame().getMap().getLocations();
        System.out.println("MAP");
        System.out.println(" 1  2  3  4  5 ");
        for (int i = 0; i < locations.length; i++) {
            System.out.println(" - ");
            System.out.println(locations.length);

            for (int j = 0; j < locations[i].length; j++) {
                System.out.println(" | ");
                Location location = locations[i][j];
                if (location.isVisited()) {
                    System.out.println("V");
                } else {
                    System.out.println(" ?? ");
                }
            }
            
            System.out.println(" | ");
        }
        
        System.out.println(" - ");
    }

}
