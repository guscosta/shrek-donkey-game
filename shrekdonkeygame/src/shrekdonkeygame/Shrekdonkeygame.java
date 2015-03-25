package shrekdonkeygame;

import BYUI.CIT260.ShrekDonkeyGame.model.Actor;
import BYUI.CIT260.ShrekDonkeyGame.model.Donkey;
import BYUI.CIT260.ShrekDonkeyGame.model.EnemyScene;
import BYUI.CIT260.ShrekDonkeyGame.model.Game;
import BYUI.CIT260.ShrekDonkeyGame.model.Location;
import BYUI.CIT260.ShrekDonkeyGame.model.Map;
import BYUI.CIT260.ShrekDonkeyGame.model.Phrase;
import BYUI.CIT260.ShrekDonkeyGame.model.Player;
import BYUI.CIT260.ShrekDonkeyGame.model.PuzzleScene;
import BYUI.CIT260.ShrekDonkeyGame.model.RegularScene;
import BYUI.CIT260.ShrekDonkeyGame.model.Shrek;
import BYUI.CIT260.ShrekDonkeyGame.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Shrekdonkeygame {

    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;

    public static void main(String[] args) {

        try {

            // open character stream files for end user input and output
            Shrekdonkeygame.inFile
                    = new BufferedReader(new InputStreamReader(System.in));

            Shrekdonkeygame.outFile = new PrintWriter(System.out, true);

            // open log file
            String filePath = "log.txt";
            Shrekdonkeygame.logFile = new PrintWriter(filePath);

            StartProgramView startProgram = new StartProgramView("");
            startProgram.display();

        } catch (Throwable te) {
            te.printStackTrace();
            System.out.println("Exception: " + te.toString()
                    + "\nCause: " + te.getCause()
                    + "\nMessage: " + te.getMessage());
        } finally {
            try {
                if (Shrekdonkeygame.inFile != null) {
                    Shrekdonkeygame.inFile.close();
                }

                if (Shrekdonkeygame.outFile != null) {
                    Shrekdonkeygame.outFile.close();
                }

                if (Shrekdonkeygame.logFile != null) {
                    Shrekdonkeygame.outFile.close();
                }

            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }

    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Shrekdonkeygame.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Shrekdonkeygame.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Shrekdonkeygame.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Shrekdonkeygame.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Shrekdonkeygame.logFile = logFile;
    }

}
