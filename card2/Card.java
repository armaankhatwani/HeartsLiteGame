public class Card implements Comparable<Card>{
    private String name;
    private String suit;
    private int rank;
    
    public Card() {
        name = "default";
        suit = "default";
        rank = 0;
    }
    
    public Card(String n, String s, int r) {
        name = n;
        suit = s;
        rank = r;
    }
    
    public String getName() {
        return name;
    }
    
    public String getSuit() {
        return suit;
    }
    
    public int getRank() {
        return rank;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public void setSuit(String s) {
        suit = s;
    }
    
    public void setRank(int r) {
        rank = r;
    }
    
    public boolean equals(Card card) {
        if (name.equals(card.getName()) && suit.equals(card.getSuit()) && rank == card.getRank()) {
            return true;
        } else {
            return false;
        }
    }

    public int compareTo(Card card) {
        if (suit.equals(card.getSuit())) {
            if (rank > card.getRank()) {
                return 1;
            } else if (rank < card.getRank()) {
                return -1;
            } else {
                return 0;
            }
        } else {
            if (suit.equals("clubs")) {
                return 1;
            } else if (card.getSuit().equals("clubs")) {
                return -1;
            } else if (suit.equals("spades")) {
                return 1;
            } else if (card.getSuit().equals("spades")) {
                return -1;
            } else if (suit.equals("hearts")) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    public String toString() {
        String symbol = "";
        if (suit.equals("clubs")) {
            symbol = "c";
        } else if (suit.equals("spades")) {
            symbol = "s";
        } else if (suit.equals("hearts")) {
            symbol = "h";
        } else if (suit.equals("diamonds")) {
            symbol = "d";
        }
        return symbol + name + "(" + rank + ")";
    }
}