public class Main {
    public static void main(String[] args) {
        // Create objects using different constructors
        Circle cDefault = new Circle();
        Circle cFromDouble = new Circle(2.5);
        Circle cFromInt = new Circle(3);

        Rectangle rDefault = new Rectangle();
        Rectangle rLW = new Rectangle(4.0, 2.0);
        Rectangle rSquare = new Rectangle(5.0); // uses single-arg constructor

        RegularPolygon pDefault = new RegularPolygon();
        RegularPolygon pBoth = new RegularPolygon(6, 2.0);
        RegularPolygon pSwapped = new RegularPolygon(1.5, 8); // uses swapped constructor

        // Print details
        System.out.println(cDefault);
        System.out.println(cFromDouble);
        System.out.println(cFromInt);
        System.out.println();
        System.out.println(rDefault);
        System.out.println(rLW);
        System.out.println(rSquare);
        System.out.println();
        System.out.println(pDefault);
        System.out.println(pBoth);
        System.out.println(pSwapped);

        // Observations about constructor resolution are in REPORT.md
    }
}
