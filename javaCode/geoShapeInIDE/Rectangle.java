/**
 * Rectangle class representing a rectangle with length and width.
 */
public class Rectangle {
    private double length;
    private double width;

    // Default constructor
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // Constructor with length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overloaded constructor with swapped parameter order (for experiment)
    public Rectangle(double widthOnly) {
        this.length = widthOnly;
        this.width = widthOnly;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle: length = " + length + ", width = " + width + ", area = " + area();
    }
}
