import java.util.Scanner;

public class SoalArray {
    public static void main(String[] args) {
        
        // ==========================================
        // SOAL NO. 1
        // Deklarasi & inisialisasi array 2D 'matrix' (long, 4 baris 3 kolom, isi 5)
        // ==========================================
        System.out.println("=== SOAL NO. 1 ===");
        long[][] matrix = {
            {5, 5, 5},
            {5, 5, 5},
            {5, 5, 5},
            {5, 5, 5}
        };

        // Menampilkan isi matrix
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        // ==========================================
        // SOAL NO. 2
        // Deklarasi & inisialisasi array 1D 'values' (byte, ukuran 10, isi 1)
        // ==========================================
        System.out.println("\n=== SOAL NO. 2 ===");
        byte[] values = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        // Menampilkan isi values
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();


        // ==========================================
        // SOAL NO. 3
        // Menentukan output dari program loop 1D
        // ==========================================
        System.out.println("\n=== SOAL NO. 3 (OUTPUT) ===");
        int num1[] = {7, 7, 6, 6, 5, 5, 4, 4};
        for (int i = 0; i < 8; i = i + 2) {
            System.out.print(num1[i]);
        }
        System.out.println(); // Outputnya adalah: 7654


        // ==========================================
        // SOAL NO. 4
        // Menentukan output dari program array 2D
        // ==========================================
        System.out.println("\n=== SOAL NO. 4 (OUTPUT) ===");
        int[][] num2 = {{3, 3, 3}, {2, 2, 2}};
        int[] array = {4, 3, 2};

        // Mengubah baris kedua dari num2
        for (int i = 0; i < 3; i++) {
            num2[1][i] = num2[0][i] + array[i];
        }

        // Mencetak hasilnya
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(num2[i][j]);
            }
            System.out.println();
        }
        /* Outputnya:
           333
           755
        */


        // ==========================================
        // SOAL NO. 5
        // Program menghitung rata-rata 5 nilai tes
        // ==========================================
        System.out.println("\n=== SOAL NO. 5 ===");
        Scanner scanner = new Scanner(System.in);
        double[] nilaiTes = new double[5];
        double total = 0;

        System.out.println("Masukkan 5 nilai tes:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nilai tes ke-" + (i + 1) + ": ");
            nilaiTes[i] = scanner.nextDouble();
            total += nilaiTes[i]; // Menjumlahkan nilai
        }

        double rataRata = total / 5;
        System.out.println("Rata-rata nilai tes adalah: " + rataRata);

        scanner.close();
    }
}