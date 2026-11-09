
public class Hand {
    Card[] cards = new Card[5];
    int cardCount = 0;

    public boolean addCard(Card card) {
        if (card == null || cardCount >= cards.length) {
            return false;
        }

        cards[cardCount] = card;
        cardCount++;
        return true;
    }

    public int getPoints() {
        int total = 0;
        int aceCount = 0;

        for (int i = 0; i < cardCount; i++) {
            total += cards[i].points;

            if (cards[i].name.equals("Ace")) {
                aceCount++;
            }
        }

        while (total > 21 && aceCount > 0) {
            total -= 10;
            aceCount--;
        }

        return total;
    }

    public int getCardCount() {
        return cardCount;
    }

    public void printHand() {
        for (int i = 0; i < cardCount; i++) {
            System.out.println(cards[i]);
        }

        System.out.println("Total poin: " + getPoints());
    }
}