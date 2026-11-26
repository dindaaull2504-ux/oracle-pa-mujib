import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- PROGRAM ANAGRAM ---");
        System.out.print("Masukkan kata pertama: ");
        String kata1 = scanner.nextLine();

        System.out.print("Masukkan kata kedua: ");
        String kata2 = scanner.nextLine();

        String s1 = kata1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String s2 = kata2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        boolean isAnagram = true;

        if (s1.length() != s2.length()) {
            isAnagram = false;
        } else {

            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();

            for (int i = 0; i < arr1.length; i++) {
                for (int j = i + 1; j < arr1.length; j++) {
                    if (arr1[i] > arr1[j]) {
                        char temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
                    }
                    if (arr2[i] > arr2[j]) {
                        char temp = arr2[i];
                        arr2[i] = arr2[j];
                        arr2[j] = temp;
                    }
                }
            }

            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    isAnagram = false;
                    break;
                }
            }
        }

        if (isAnagram) {
            System.out.println("\nHasil: KEDUANYA ADALAH ANAGRAM!");
        } else {
            System.out.println("\nHasil: BUKAN ANAGRAM!");
        }

        scanner.close();
    }
}