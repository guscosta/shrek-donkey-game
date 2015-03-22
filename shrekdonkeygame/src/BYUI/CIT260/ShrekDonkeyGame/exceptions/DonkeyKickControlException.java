/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.ShrekDonkeyGame.exceptions;

/**
 *
 * @author hecto_000
 */
public class DonkeyKickControlException extends Exception {

    public DonkeyKickControlException() {
    }

    public DonkeyKickControlException(String message) {
        super(message);
    }

    public DonkeyKickControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public DonkeyKickControlException(Throwable cause) {
        super(cause);
    }

    public DonkeyKickControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
