public class Animal {
    private String name;
    private double height;

    public Animal(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Height: " + height);
    }
}