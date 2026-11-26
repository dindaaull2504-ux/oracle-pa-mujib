
public class Task5 {
    public static void main(String[] args) {
        Student mary = new Student("Mary Jones", 14, 46);
        Student john = new Student("John Stiner", 60, 173);
        Student ari = new Student("Ari Samala", 31, 69);

        System.out.println("Mary Jones GPA: " + mary.getGpa());
        System.out.println("John Stiner GPA: " + john.getGpa());
        System.out.println("Ari Samala GPA: " + ari.getGpa());
    }
}
