public class Task6 {
    public static void main(String[] args) {
        Student ari = new Student("Ari Samala", 31, 69);

        ari.addCredits(13, 52);

        System.out.println("Nama: " + ari.getName());
        System.out.println("GPA Ari: " + ari.getGpa());
    }
}