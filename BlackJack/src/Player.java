import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand;
    private int score;
    private int balance;
    private int bet;

    public Player(int initialBalance) {
        hand = new ArrayList<>();
        score = 0;
        balance = initialBalance;
        bet = 0;
    }

    public void addCard(Card card) {
        hand.add(card);
        score += card.getValue();
    }

    public int getScore() {
        return score;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void resetHand() {
        hand.clear();
        score = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void placeBet(int betAmount) {
        if (betAmount <= balance) {
            bet = betAmount;
            balance -= betAmount;
        } else {
            System.out.println("Insufficient balance to place this bet.");
        }
    }

    public int getBet(){
        return bet;
    }

    public void winBet(){
        balance += 2 * bet;
    }


}
public static void main(String Args[]) {

}