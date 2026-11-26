import java.util.Scanner;

public class RataRataNilai {
    public static void main(String[] args) {
        System.out.println("=== PROGRAM MENGHITUNG RATA-RATA NILAI ===");
        
        Scanner scanner = new Scanner(System.in);
        double[] nilaiTes = new double[5];
        double total = 0;

        // Menerima input 5 nilai tes dari pengguna
        System.out.println("Masukkan 5 nilai tes:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nilai tes ke-" + (i + 1) + ": ");
            nilaiTes[i] = scanner.nextDouble();
            total += nilaiTes[i]; // Menjumlahkan seluruh nilai yang dimasukkan
        }

        // Menghitung rata-rata
        double rataRata = total / 5;
        
        // Menampilkan hasil rata-rata
        System.out.println("\nNilai rata-rata mahasiswa adalah: " + rataRata);

        scanner.close();
    }
}