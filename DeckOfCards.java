package SechzNimmt;

public class DeckOfCards {
    private int nrOfCards;
    private Card allCards[] = new Card[104];


    DeckOfCards()
    {
        nrOfCards = 0;


        for (int i=0;i<104;i=i+1)
        {
            int cardNumber = i + 1;
            Card c = new Card(cardNumber);
            addCardToPile(c);
        }


    }


    public Card getOneCard()
    {
        int posOfLastCard = nrOfCards - 1;
        Card cardToBeReturned = allCards[posOfLastCard];
        nrOfCards = nrOfCards - 1;
        return cardToBeReturned;
    }


    public void addCardToPile(Card c)
    {
        int freePosition = nrOfCards;
        allCards[freePosition] = c;
        nrOfCards = nrOfCards + 1;
    }

}
 