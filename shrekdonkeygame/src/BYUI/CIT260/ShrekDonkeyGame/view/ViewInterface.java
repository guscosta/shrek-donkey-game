/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.ShrekDonkeyGame.view;

/**
 *
 * @author hecto_000
 */
public interface ViewInterface {
    
    public void display();
    public String getInput();
    public boolean doAction(Object obj);
    // Need to typecase afterwards String myValue = (String) obj;
  
}
