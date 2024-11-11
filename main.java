package SechzNimmt;


public class main {
    public static void main(String[] args) {
        DeckOfCards myDeck_01 = new DeckOfCards();
        DeckOfCards myDeck_02 = new DeckOfCards();


        Card theCard = myDeck_01.getOneCard();
        theCard.printInformation();


        theCard = myDeck_02.getOneCard();
        theCard.printInformation();

        
    }
}
