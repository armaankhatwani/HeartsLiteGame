import java.util.ArrayList;
import java.util.Collections;

public class CardPlayerLevel1 extends CardPlayer {

    public CardPlayerLevel1(String name, int score, ArrayList<Card> hand) {
        super(name, score, hand);
    }

    public Card chooseCard(ArrayList<Card> roundCards, ArrayList<Card> gameCards) {
        if (roundCards.size()==0) {
            return playRandomCard();
        }
        
        Card firstCard = roundCards.get(0);
        for (Card c : getHand()) {
            if (c.getSuit().equals(firstCard.getSuit())) {
                return playRandomCardOfSuit(firstCard.getSuit());
            }
            if (c.getName().equals("Q") && c.getSuit().equals("spades")) {
                getHand().remove(c);
                return c;
            }
            if (c.getSuit().equals("hearts")) {
                return playHighestHeart();
            }
        }

        return playRandomCard();
    }

    private Card playHighestHeart() {
        ArrayList<Card> hearts = new ArrayList<>();
        for (Card c : getHand()) {
            if (c.getSuit().equals("hearts")) {
                hearts.add(c);
            }
        }
        Collections.sort(hearts, Collections.reverseOrder());
        Card highestHeart = hearts.get(0);
        getHand().remove(highestHeart);
        return highestHeart;
    }
}
