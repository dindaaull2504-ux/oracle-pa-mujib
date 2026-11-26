class nicestFish {
    private String species;
    private String color;

    public nicestFish(String species, String color) {
        this.species = species;
        this.color = color;
    }

    public String getSpecies() {
        return species;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        nicestFish fish = new nicestFish("Betta", "Blue");
        System.out.println("Fish: " + fish.getSpecies() + " (" + fish.getColor() + ")");
    }
}