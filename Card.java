package SechzNimmt;


public class Card {

// Internal state
    private int number;
    private int hornOchs = 1; // Initialize properly

    // Constructor for the Card class (no return type)
    public Card(int nr) {
        number = nr;
    }

    // Dynamic behavior
    public int getNumber() {
        return number;
    }

    public int getOchsPoints() {
        // Reinitialize hornOchs based on card number logic
        if (number == 55) {
            hornOchs = 7;
        } else if (number % 10 == 5) {
            hornOchs = 2;
        } else if (number % 10 == 0) {
            hornOchs = 3;
        } else if (number % 11 == 0) {
            hornOchs = 5;
        } else {
            hornOchs = 1; // Default case
        }

        return hornOchs;
    }

    public void printInformation() {
        System.out.println("Number of card: " + number);
        System.out.println("Horn Ochs points: " + getOchsPoints());
    }
}

  