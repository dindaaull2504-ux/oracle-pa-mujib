import java.util.Scanner;

public class BeratDiPlanet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan berat Anda di Bumi (lbs/kg): ");
        double beratBumi = scanner.nextDouble();

        System.out.println("\nPilih Planet:");
        System.out.println("1. Merkurius");
        System.out.println("2. Venus");
        System.out.println("3. Mars");
        System.out.println("4. Jupiter");
        System.out.println("5. Saturnus");
        System.out.println("6. Uranus");
        System.out.println("7. Neptunus");
        System.out.print("Pilihan planet Anda (1-7): ");
        int pilihan = scanner.nextInt();

        double faktorKonversi = 0;
        String namaPlanet = "";

        switch (pilihan) {
            case 1:
                namaPlanet = "Merkurius";
                faktorKonversi = 0.38;
                break;
            case 2:
                namaPlanet = "Venus";
                faktorKonversi = 0.91;
                break;
            case 3:
                namaPlanet = "Mars";
                faktorKonversi = 0.38;
                break;
            case 4:
                namaPlanet = "Jupiter";
                faktorKonversi = 2.36;
                break;
            case 5:
                namaPlanet = "Saturnus";
                faktorKonversi = 0.92;
                break;
            case 6:
                namaPlanet = "Uranus";
                faktorKonversi = 0.89;
                break;
            case 7:
                namaPlanet = "Neptunus";
                faktorKonversi = 1.13;
                break;
            default:
                System.out.println("Pilihan planet tidak valid!");
                scanner.close();
                return;
        }

        double beratDiPlanet = beratBumi * faktorKonversi;
        System.out.printf("Your weight on %s is %.2f lbs.%n", namaPlanet, beratDiPlanet);

        scanner.close();
    }
}