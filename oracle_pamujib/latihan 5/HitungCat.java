import java.util.Scanner;

public class HitungCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tinggi ruangan (kaki): ");
        double tinggi = scanner.nextDouble();

        System.out.print("Masukkan panjang ruangan (kaki): ");
        double panjang = scanner.nextDouble();

        System.out.print("Masukkan lebar ruangan (kaki): ");
        double lebar = scanner.nextDouble();

        double luasDinding = 2 * (panjang * tinggi + lebar * tinggi);
        double luasLangitLangit = panjang * lebar;
        double totalLuas = luasDinding + luasLangitLangit;

        int ember5L = (int) (totalLuas / 1500);
        double sisaLuas = totalLuas % 1500;

        int ember1L = (int) Math.ceil(sisaLuas / 300.0);

        if (ember1L >= 4) {
            ember5L += 1;
            ember1L = 0;
        }

        int totalBiaya = (ember5L * 15) + (ember1L * 4);

        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.printf("Total Luas yang Diciptakan: %.2f kaki persegi\n", totalLuas);
        System.out.println("Ember 5 Liter yang dibutuhkan: " + ember5L + " kaleng");
        System.out.println("Ember 1 Liter yang dibutuhkan: " + ember1L + " kaleng");
        System.out.println("Total Biaya: $" + totalBiaya);

        scanner.close();
    }
}