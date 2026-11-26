import java.util.Scanner;

public class PesanRahasia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder pesan = new StringBuilder();

        System.out.println("--- PROGRAM DEKODE PESAN RAHASIA ---");
        System.out.println("Masukkan 10 angka (satu per satu):");

        int count = 0;
        while (count < 10) {
            System.out.print("Angka ke-" + (count + 1) + ": ");
            int angka = scanner.nextInt();

            String huruf = "";
            switch (angka) {
                case 1: huruf = "D"; break;
                case 2: huruf = "W"; break;
                case 3: huruf = "E"; break;
                case 4: huruf = "L"; break;
                case 5: huruf = "H"; break;
                case 6: huruf = "O"; break;
                case 7: huruf = "R"; break;
                default:
                    System.out.println("-> Angka belum terpecahkan! Masukkan angka baru (1-7).");
                    continue;
            }

            pesan.append(huruf);
            count++;
        }

        System.out.println("\n==============================");
        System.out.println("Pesan Teruraikan: " + pesan.toString());
        System.out.println("==============================");

        scanner.close();
    }
}