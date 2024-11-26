package SechzNimmt;


public class Card {

// Internal state
    private int number;
    private int hornOx = 1; // Initialize properly

    // Constructor for the Card class (no return type)
    public Card(int nr) {
        number = nr;
    }

    // Dynamic behavior
    public int getNumber() {
        return number;
    }

    public int getOxPoints() {
        // Reinitialize hornOx based on card number logic
        if (number == 55) {
            hornOx = 7;
        } else if (number % 10 == 5) {
            hornOx = 2;
        } else if (number % 10 == 0) {
            hornOx = 3;
        } else if (number % 11 == 0) {
            hornOx = 5;
        } else {
            hornOx = 1; // Default case
        }

        return hornOx;
    }

    public void printInformation() {
        System.out.println("Number of card: " + number);
        System.out.println("Horn Ox points: " + getOxPoints());
    }
}

  