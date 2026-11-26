import java.util.Scanner;

public class OperasiMatriks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[][] matriksA = new double[2][2];
        double[][] matriksB = new double[2][2];

        System.out.println("=== PROGRAM OPERASI MATRIKS 2x2 ===");

        System.out.println("\nMasukkan elemen Matriks A:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                matriksA[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\nMasukkan elemen Matriks B:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                matriksB[i][j] = scanner.nextDouble();
            }
        }

        // 1. Penjumlahan (A + B)
        System.out.println("\n--- Hasil Penjumlahan (A + B) ---");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                double hasil = matriksA[i][j] + matriksB[i][j];
                System.out.print(hasil + "\t");
            }
            System.out.println();
        }

        // 2. Pengurangan (A - B)
        System.out.println("\n--- Hasil Pengurangan (A - B) ---");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                double hasil = matriksA[i][j] - matriksB[i][j];
                System.out.print(hasil + "\t");
            }
            System.out.println();
        }

        // 3. Perkalian (A * B)
        System.out.println("\n--- Hasil Perkalian (A * B) ---");
        double[][] hasilKali = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasilKali[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    hasilKali[i][j] += matriksA[i][k] * matriksB[k][j];
                }
                System.out.print(hasilKali[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}