package Practical3;

class Trapezium {
    private double base;
    private double height;
    private double top;

    // Constructor
    public Trapezium(double b, double h, double t) {
        base = b;
        height = h;
        top = t;
    }

    // Getters
    public double getBase() {
        return this.base;
    }
    public double getHeight() {
        return this.height;
    }
    public double getTop() {
        return this.top;
    }

    // Calculate Area
    public double calcArea() {
        return (this.base + this.top) * height / 2;
    }
}

public class TrapeziumUser {
    public static void main(String[] args) {
        System.out.println("Trapezium class program started.\n");
        final Trapezium trapezium = new Trapezium(6.0, 4.0, 5.0);
        System.out.printf("This trapezium has base value %.1f\n", trapezium.getBase());
        System.out.printf("This trapezium has top value %.1f\n", trapezium.getTop());
        System.out.printf("This trapezium has height value %.1f\n", trapezium.getHeight());
        System.out.printf("\nThe area of the trapezium is %.1f\n", trapezium.calcArea());
        System.out.println("\nTrapezium class program started.");
    }
}