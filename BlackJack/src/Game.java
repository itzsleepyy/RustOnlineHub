import java.util.HashMap;

public class Game {

    // Fields
    HashMap<String, Player> PlayerSet = new HashMap<String, Player>();

    // Getters


    // Setters
    public HashMap<String, Player> getPlayersFromFile() {
        HashMap<String, Player> PlayerSetRetrieval = new HashMap<String, Player>();

        int balance = 10;
        Player testPlayer = new Player(balance);

        PlayerSetRetrieval.put("", testPlayer);
        return PlayerSetRetrieval;
    }
}
