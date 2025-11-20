public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5.5);

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(4.0, 7.5);
        Rectangle rectangle3 = new Rectangle(6.0);

        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(5, 3.2);
        RegularPolygon polygon3 = new RegularPolygon(8);

        System.out.println(circle1.getDetails());
        System.out.println(circle2.getDetails());

        System.out.println(rectangle1.getDetails());
        System.out.println(rectangle2.getDetails());
        System.out.println(rectangle3.getDetails());

        System.out.println(polygon1.getDetails());
        System.out.println(polygon2.getDetails());
        System.out.println(polygon3.getDetails());
    }
}

class Circle {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getDetails() {
        return "Circle: radius = " + radius;
    }
}

class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double side) {
        this.length = side;
        this.width = side;
    }

    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    public String getDetails() {
        return "Rectangle: length = " + length + ", width = " + width;
    }
}

class RegularPolygon {
    private int numberOfSides;
    private double sideLength;

    public RegularPolygon() {
        this.numberOfSides = 3;
        this.sideLength = 1.0;
    }

    public RegularPolygon(int numberOfSides, double sideLength) {
        this.numberOfSides = numberOfSides;
        this.sideLength = sideLength;
    }

    public RegularPolygon(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        this.sideLength = 1.0;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }
    public double getSideLength() {
        return sideLength;
    }

    public String getDetails() {
        return "RegularPolygon: sides = " + numberOfSides + ", side length = " + sideLength;
    }
}