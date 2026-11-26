
public class Shape {
    private int numSides;
    private boolean regular;

    public Shape() {
        numSides = 0;
        regular = false;
    }

    public Shape(int numSides, boolean regular) {
        this.numSides = numSides;
        this.regular = regular;
    }

    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    public boolean getRegular() {
        return regular;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }
}
