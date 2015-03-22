package BYUI.CIT260.ShrekDonkeyGame.exceptions;

public class ShrekStateControlException extends Exception {

    public ShrekStateControlException() {
    }

    public ShrekStateControlException(String message) {
        super(message);
    }

    public ShrekStateControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public ShrekStateControlException(Throwable cause) {
        super(cause);
    }

    public ShrekStateControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
