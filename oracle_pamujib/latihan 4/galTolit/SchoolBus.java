import java.util.Scanner;

public class SchoolBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int kapasitasBus = 45;

        System.out.print("Masukkan jumlah orang yang mendaftar perjalanan: ");
        int totalOrang = scanner.nextInt();

        int jumlahBus = totalOrang / kapasitasBus;

        int sisaOrangVan = totalOrang % kapasitasBus;

        System.out.println("----------------------------------------");
        System.out.println("Jumlah bus yang diperlukan: " + jumlahBus);
        System.out.println("Total jumlah orang yang harus naik van: " + sisaOrangVan);

        scanner.close();
    }
}