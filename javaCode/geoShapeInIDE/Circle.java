/**
 * Circle class representing a circle with a radius.
 */
public class Circle {
    /**
     * Circle class representing a circle with a radius.
     */
    public class Circle {
        private double radius;

        // Default constructor
        public Circle() {
            this.radius = 1.0;
        }

        // Single-argument constructor
        public Circle(double radius) {
            this.radius = radius;
        }

        // Overloaded constructor with int parameter
        public Circle(int radiusAsInt) {
            this.radius = radiusAsInt;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double area() {
            return Math.PI * radius * radius;
        }

        @Override
        public String toString() {
            return "Circle: radius = " + radius + ", area = " + area();
        }
    }
                }
