import java.util.ArrayList;
import java.util.Collections;

public class CardPlayer extends Player {
    private ArrayList<Card> hand;
    private ArrayList<Card> takenCards;

    public CardPlayer(String name, int score, ArrayList<Card> hand) {
        super(name, score);
        this.hand = hand;
        this.takenCards = new ArrayList<>();
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public Card playCard(int index) {
        Card card = hand.get(index);
        hand.remove(index);
        return card;
    }

    public Card chooseCard(ArrayList<Card> roundCards, ArrayList<Card> gameCards) {
        if (roundCards.size() == 0 || roundCards.size()==1) {
            return playRandomCard();
        }

        Card firstCard = roundCards.get(0);
        
        for (Card c : hand) {
            if (c.getSuit().equals(firstCard.getSuit())) {
                return playRandomCardOfSuit(firstCard.getSuit());
            }
            if (c.getSuit().equals("h")) {
                return playRandomHeart();
            }
        }

        return playRandomCard();
    }   

    public Card playRandomCard() {
        int index = (int) (Math.random() * hand.size());
        return playCard(index);
    }

    public Card playRandomCardOfSuit(String suit) {
        ArrayList<Card> suitCards = new ArrayList<>();
        for (Card c : hand) {
            if (c.getSuit().equals(suit)) {
                suitCards.add(c);
            }
        }
        int index = (int) (Math.random() * suitCards.size());
        Card card = suitCards.get(index);
        hand.remove(card);
        return card;
    }

    public Card playRandomHeart() {
        ArrayList<Card> heartCards = new ArrayList<>();
        for (Card c : hand) {
            if (c.getSuit().equals("h")) {
                heartCards.add(c);
            }
        }
        int index = (int) (Math.random() * heartCards.size());
        return playCard(hand.indexOf(heartCards.get(index)));
    }

     public String toString() {
        Collections.sort(hand);

        String result = getName() + " (" + getScore() + ") [";
        boolean firstCardPrinted = false;
        for (Card card : hand) {
            if (firstCardPrinted) {
                result += ", ";
            } else {
                firstCardPrinted = true;
            }
            result += card.toString();
        }
        result += "]";
        return result;
    }
}