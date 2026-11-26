
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        String answer = "yes";

        for (int i = 1; i <= 5 && total <= 21; i++) {
            Card card = new Card();

            System.out.println("Card " + i + ":");
            card.displayCard();

            total += card.getPoint();

            System.out.println("Total point: " + total);

            if (total > 21 || i == 5) {
                break;
            }

            System.out.print("Take another card? (yes/no): ");
            answer = input.nextLine();

            if (answer.equalsIgnoreCase("no")) {
                break;
            }
        }

        System.out.println("Final total: " + total);

        input.close();
    }
}
