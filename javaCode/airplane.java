/* Assignment 2 - Control Tower */
/* Class name - must be "Assignment2" in order to run */
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Airplane plane1 = new Airplane();
        Airplane plane2 = new Airplane("AAA02", 15.8, 128, 30000);

        System.out.println("Enter the details of the third airplane (call-sign, distance, bearing and altitude):");
        String cs = scanner.nextLine();
        double d3 = scanner.nextDouble();
        int dir3 = scanner.nextInt();
        int alt3 = scanner.nextInt();
        cs = cs.toUpperCase();
        Airplane plane3 = new Airplane(cs, d3, dir3, alt3);

        System.out.println();
        System.out.println("Initial Positions:");
        System.out.println("\"Airplane 1\": " + plane1);
        System.out.println("\"Airplane 2\": " + plane2);
        System.out.println("\"Airplane 3\": " + plane3);

        System.out.println();
    System.out.println("Initial Distances:");
    double d12 = plane1.distTo(plane2);
    double d13 = plane1.distTo(plane3);
    double d23 = plane2.distTo(plane3);
    System.out.println("The distance between Airplane 1 and Airplane 2 is " + formatDist(d12) + " miles.");
    System.out.println("The distance between Airplane 1 and Airplane 3 is " + formatDist(d13) + " miles.");
    System.out.println("The distance between Airplane 2 and Airplane 3 is " + formatDist(d23) + " miles.");

        System.out.println();
        System.out.println("Initial Height Differences:");
        System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + Math.abs(plane1.getAlt() - plane2.getAlt()) + " feet.");
        System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + Math.abs(plane1.getAlt() - plane3.getAlt()) + " feet.");
        System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + Math.abs(plane2.getAlt() - plane3.getAlt()) + " feet.");

    double d23rounded = Math.round(d23 * 100.0) / 100.0;
    plane1.move(d23rounded, 65);
        plane2.move(8.0, 135);
        plane3.move(5.0, 55);

        plane1.gainAlt();
        plane1.gainAlt();
        plane1.gainAlt();

        plane2.loseAlt();
        plane2.loseAlt();

        plane3.loseAlt();
        plane3.loseAlt();
        plane3.loseAlt();
        plane3.loseAlt();

        System.out.println();
        System.out.println("New Positions: ");
        System.out.println("\"Airplane 1\": " + plane1);
        System.out.println("\"Airplane 2\": " + plane2);
        System.out.println("\"Airplane 3\": " + plane3);

        System.out.println();
    System.out.println("New Distances:");
    double nd12 = plane1.distTo(plane2);
    double nd13 = plane1.distTo(plane3);
    double nd23 = plane2.distTo(plane3);
    System.out.println("The distance between Airplane 1 and Airplane 2 is " + formatDist(nd12) + " miles.");
    System.out.println("The distance between Airplane 1 and Airplane 3 is " + formatDist(nd13) + " miles.");
    System.out.println("The distance between Airplane 2 and Airplane 3 is " + formatDist(nd23) + " miles.");

        System.out.println();
        System.out.println("New Height Differences:");
        System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + Math.abs(plane1.getAlt() - plane2.getAlt()) + " feet.");
        System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + Math.abs(plane1.getAlt() - plane3.getAlt()) + " feet.");
        System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + Math.abs(plane2.getAlt() - plane3.getAlt()) + " feet.");

        scanner.close();
    }

    // Helper to format distances: show 1 decimal if second decimal digit is zero, otherwise 2 decimals
    private static String formatDist(double d) {
        double dRounded2 = Math.round(d * 100.0) / 100.0;
        int secondDigit = (int) Math.round(dRounded2 * 100) % 10;
        if (secondDigit == 0) {
            return String.format("%.1f", dRounded2);
        } else {
            return String.format("%.2f", dRounded2);
        }
    }
}

class Airplane {
    private String callsign;
    private double x; 
    private double y; 
    private int altitude; 

    public Airplane() {
        this.callsign = "AAA01";
        this.x = 0.0;
        this.y = 1.0;
        this.altitude = 0;
    }

    public Airplane(String cs, double dist, int dir, int alt) {
        this.callsign = cs;
        double d = Math.abs(dist);
        int dirNorm = ((dir % 360) + 360) % 360;
        double rad = Math.toRadians(dirNorm);
        this.x = d * Math.sin(rad);
        this.y = d * Math.cos(rad);
        this.altitude = Math.abs(alt);
    }

    public void move(double dist, int dir) {
        double d = Math.abs(dist);
        int dirNorm = ((dir % 360) + 360) % 360;
        double rad = Math.toRadians(dirNorm);
        this.x += d * Math.sin(rad);
        this.y += d * Math.cos(rad);
    }

    public void gainAlt() {
        this.altitude += 1000;
    }

    public void loseAlt() {
        this.altitude = Math.max(0, this.altitude - 1000);
    }

    public int getAlt() {
        return this.altitude;
    }

    public double distTo(Airplane other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    private int bearingDeg() {
        double rad = Math.atan2(this.x, this.y);
        double deg = Math.toDegrees(rad);
        if (deg < 0) deg += 360.0;
        int b = (int) Math.round(deg) % 360;
        if (b == 360) b = 0;
        return b;
    }

    private double distFromOrigin() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    @Override
    public String toString() {
        double d = distFromOrigin();
        double dRounded2 = Math.round(d * 100.0) / 100.0;
        int secondDigit = (int) Math.round(dRounded2 * 100) % 10;
        String distStr;
        if (secondDigit == 0) {
            distStr = String.format("%.1f", dRounded2);
        } else {
            distStr = String.format("%.2f", dRounded2);
        }

        int b = bearingDeg();
        String bStr = String.format("%03d", b);
        return this.callsign + " - " + distStr + " miles away at bearing " + bStr + "\u00B0, altitude " + this.altitude + " feet";
    }
}
