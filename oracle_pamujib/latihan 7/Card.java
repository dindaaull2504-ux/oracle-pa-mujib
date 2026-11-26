
import java.util.Random;

public class Card {
    private String suit;
    private String face;
    private int point;

    public Card() {
        Random random = new Random();

        String[] suits = {
            "Hearts", "Diamonds", "Clubs", "Spades"
        };

        String[] faces = {
            "Ace", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King"
        };

        suit = suits[random.nextInt(suits.length)];
        face = faces[random.nextInt(faces.length)];

        if (face.equals("Ace")) {
            point = 11;
        } else if (face.equals("Jack") ||
                   face.equals("Queen") ||
                   face.equals("King")) {
            point = 10;
        } else {
            point = Integer.parseInt(face);
        }
    }

    public int getPoint() {
        return point;
    }

    public void displayCard() {
        System.out.println(face + " of " + suit);
        System.out.println("Point: " + point);
    }
}
