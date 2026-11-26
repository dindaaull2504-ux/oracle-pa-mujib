public class MainLatihan {
    public static void main(String[] args) {
        Student student1 = new Student("Mary Jones", 14, 46);
        Student student2 = new Student("John Stiner", 60, 173);
        Student student3 = new Student("Ari Samala", 31, 69);

        System.out.println("Mary Jones: " + student1.getGpa());
        System.out.println("John Stiner: " + student2.getGpa());
        System.out.println("Ari Samala: " + student3.getGpa());
    }
}