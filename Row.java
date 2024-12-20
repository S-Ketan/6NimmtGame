package SechzNimmt;

import java.util.*;

public class Row {

    // Initialize the cards list
    private List<Card> cards;

    // Constructor
    public Row() {
        this.cards = new ArrayList<>();
    }

    public int numberOfCards() {
        return cards.size();
    }

    public boolean isFull() {
        return numberOfCards() >= 5;
    }

    public boolean canAddCard(Card c) {
        if (isFull()) {
            return false;
        }
        Card lastCard = cards.get(cards.size() - 1);
        return c.getNumber() > lastCard.getNumber();
    }

    public int getOxPoints() {
        int oxPoints = 0;
        for (Card card : cards) {
            oxPoints += card.getOxPoints();
        }
        return oxPoints;
    }
}