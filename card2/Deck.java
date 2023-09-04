import java.util.ArrayList;

class Deck {
    private ArrayList<Card> deck;

    public static final String[] NAMES = {"2","3","4","5","6","7","8","9","T","J","Q","K","A"};
    public static final String[] SUITS = {"clubs", "spades", "hearts", "diamonds"};
    public static final int[] RANKS = {2,3,4,5,6,7,8,9,10,11,12,13,14};

    public Deck() {
        initializeDeck();
    }

    private void initializeDeck() {
        deck = new ArrayList<>();
        for (String suit : SUITS) {
            for (int i = 0; i < NAMES.length; i++) {
                Card card = new Card(NAMES[i], suit, RANKS[i]);
                deck.add(card);
            }
        }
    }
    
    public ArrayList<Card> getDeck() {
        return deck;
    }
    
    public void setDeck(ArrayList<Card> deck){
        this.deck=deck;
    }
    
    public Card getCard(int x){
        return deck.get(x);
    }

    public Card dealTopCard() {
        if (deck.size()!=0) {
            return deck.remove(0);
        }
        return null;
    }

    public void shuffle() {
        int stack = (int) (Math.random() * 9) + 2;
        int deckSize = deck.size();
    
        if (deckSize <= stack) {
            return;  
        }
    
        int stackLocation = (int) (Math.random() * (deckSize - stack + 1));
    
        ArrayList<Card> cardStack = new ArrayList<>();
        for (int i = 0; i < stack; i++) {
            cardStack.add(deck.remove(0));
        }
    
        for (Card card : cardStack) {
            deck.add(stackLocation, card);
            stackLocation++;
        }
    }

    public String toString() {
        if (deck.size()==0) {
            return "No cards in the deck!";
        }

        String result = "";
        for (Card card : deck) {
            result += card.toString();
        }
        return result;
    }
}
    
    
    
    
    