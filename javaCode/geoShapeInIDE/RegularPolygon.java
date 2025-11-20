/**
 * RegularPolygon class representing a regular polygon with numberOfSides and sideLength.
 */
public class RegularPolygon {
    private int numberOfSides;
    private double sideLength;

    // Default constructor
    public RegularPolygon() {
        this.numberOfSides = 3;
        this.sideLength = 1.0;
    }

    // Constructor with both fields
    public RegularPolygon(int numberOfSides, double sideLength) {
        this.numberOfSides = numberOfSides;
        this.sideLength = sideLength;
    }

    // Overloaded constructor with swapped parameter order to experiment (double, int)
    public RegularPolygon(double sideLength, int numberOfSides) {
        this.numberOfSides = numberOfSides;
        this.sideLength = sideLength;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public double getSideLength() {
        return sideLength;
    }

    public double perimeter() {
        return numberOfSides * sideLength;
    }

    @Override
    public String toString() {
        return "RegularPolygon: sides = " + numberOfSides + ", sideLength = " + sideLength + ", perimeter = " + perimeter();
    }
}
