import java.util.Scanner;

public class MountvilleUniversity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Apakah Anda valedictorian atau salutatorian? (true/false): ");
        boolean isTopStudent = scanner.nextBoolean();

        System.out.print("Masukkan jumlah total siswa di sekolah Anda: ");
        int jumlahSiswa = scanner.nextInt();

        System.out.print("Masukkan nilai GPA Anda (contoh: 3.5): ");
        double gpa = scanner.nextDouble();

        System.out.print("Masukkan skor SAT Anda (contoh: 1200): ");
        int sat = scanner.nextInt();

        // Mengecek apakah memenuhi salah satu dari 4 kriteria seleksi
        boolean diterima = (isTopStudent && jumlahSiswa >= 1400) ||
                           (gpa >= 4.0 && sat >= 1100) ||
                           (gpa >= 3.5 && sat >= 1300) ||
                           (gpa >= 3.0 && sat >= 1500);

        System.out.println("\n--- Hasil Seleksi ---");
        if (diterima) {
            System.out.println("Selamat! Anda diterima di Mountville University.");
        } else {
            System.out.println("Maaf, Anda belum memenuhi syarat penerimaan.");
        }

        scanner.close();
    }
}