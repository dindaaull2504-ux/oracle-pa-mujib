public class AnimalTest {
    public static void main(String[] args) {
        Animal cat = new Animal("Mochi", 25.5);
        Animal dog = new Animal("Bobi", 55.0);

        cat.displayInfo();
        System.out.println("Nama hewan: " + dog.getName() + " | Tinggi: " + dog.getHeight());
    }
}