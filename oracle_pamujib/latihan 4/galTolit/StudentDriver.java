public class StudentDriver {
    public static void main(String[] args) {
        Student s1 = new Student("Mary Jones", 14, 46);
        Student s2 = new Student("John Stiner", 60, 173);
        Student s3 = new Student("Ari Samala", 31, 69);

        System.out.println("Name: " + s1.getName() + " | GPA: " + s1.getGpa());
        System.out.println("Name: " + s2.getName() + " | GPA: " + s2.getGpa());
        System.out.println("Name: " + s3.getName() + " | GPA: " + s3.getGpa());
    }
}