public class Student {
    private String name;
    private int credits;
    private double qualityPoints;
    private double gpa;

    public Student(String name, int credits, double qualityPoints) {
        this.name = name;
        this.credits = credits;
        this.qualityPoints = qualityPoints;
        this.gpa = calculateGpa();
    }

    private double calculateGpa() {
        if (credits == 0) {
            return 0.0;
        }
        return qualityPoints / credits;
    }

    public double getGpa() {
        return gpa;
    }

    public void addCourse(int additionalCredits, double additionalQualityPoints) {
        this.credits += additionalCredits;
        this.qualityPoints += additionalQualityPoints;
        this.gpa = calculateGpa();
    }

    public void addCredits(int additionalCredits, double additionalQualityPoints) {
        addCourse(additionalCredits, additionalQualityPoints);
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public double getQualityPoints() {
        return qualityPoints;
    }
}