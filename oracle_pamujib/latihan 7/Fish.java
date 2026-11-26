public class Fish {
    // 1. Instance variable (belum diatur nilainya)
    String typeOfFish;
    int friendliness;

    // 2. Constructor tanpa argumen
    public Fish() {
        typeOfFish = "Unknown";
        friendliness = 3;
    }

    // 3. Constructor dengan argumen String t dan int f
    public Fish(String t, int f) {
        typeOfFish = t;
        friendliness = f;
    }

    // 5. Method mengembalikan tingkat keramahan ikan
    public int getFriendliness() {
        return friendliness;
    }
}