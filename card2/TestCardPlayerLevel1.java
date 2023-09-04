import java.util.ArrayList;

public class TestCardPlayerLevel1 {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        
        CardPlayerLevel1 player1 = new CardPlayerLevel1("Player 1", 0, new ArrayList<>());
        CardPlayerLevel1 player2 = new CardPlayerLevel1("Player 2", 0, new ArrayList<>());
        
        for (int i = 0; i < 7; i++) {
            player1.addCard(deck.dealTopCard());
            player2.addCard(deck.dealTopCard());
        }

        System.out.println("Player 1's hand: " + player1.getHand());
        System.out.println("Player 2's hand: " + player2.getHand());
        System.out.println();

        ArrayList<Card> roundCards = new ArrayList<>();
        roundCards.add(player1.playCard(0));
        roundCards.add(player2.playCard(0));


        System.out.println("Round cards: " + roundCards);
        System.out.println();

        Card chosenCard1 = player1.chooseCard(roundCards, new ArrayList<>());
        Card chosenCard2 = player2.chooseCard(roundCards, new ArrayList<>());

        System.out.println("Player 1 chooses: " + chosenCard1);
        System.out.println("Player 2 chooses: " + chosenCard2);
    }
}