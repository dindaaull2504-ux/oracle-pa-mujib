import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang alas (b): ");
        double b = scanner.nextDouble();

        System.out.print("Masukkan tinggi segitiga (h): ");
        double h = scanner.nextDouble();

        double a = 0.5 * b * h;

        System.out.println("Luas segitiga (A) adalah: " + a);

        scanner.close();
    }
}