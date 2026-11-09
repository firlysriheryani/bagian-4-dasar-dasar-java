public class Card {
    String suit;
    String name;
    int points;

    Card(int n1, int n2) {
        if (n1 == 1) {
            suit = "Clubs";
        } else if (n1 == 2) {
            suit = "Diamonds";
        } else if (n1 == 3) {
            suit = "Hearts";
        } else {
            suit = "Spades";
        }

        if (n2 == 1) {
            name = "Ace";
            points = 1;
        } else if (n2 == 11) {
            name = "Jack";
            points = 10;
        } else if (n2 == 12) {
            name = "Queen";
            points = 10;
        } else if (n2 == 13) {
            name = "King";
            points = 10;
        } else {
            name = String.valueOf(n2);
            points = n2;
        }
    }

    public String toString() {
        return "The " + name + " of " + suit;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public String getSuit() {
        return suit;
    }
}