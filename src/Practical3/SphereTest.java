package Practical3;

import javax.swing.JOptionPane;

class Sphere {
    private double radius = 0.0;

    // Default Cosntructor
    public Sphere() {}

    // Constructor
    public Sphere(double r) {
        radius = r;
    }

    // Getters & Setters
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    // Methods
    public double calcArea() {
        return 4 * Math.PI * Math.pow(this.radius, 2);
    }

    public double calcVolume() {
        return 4.0/3.0 * (Math.PI * Math.pow(this.radius, 3));
    }

}

public class SphereTest {
    public static void main(String[] args) {
        final String userInput = JOptionPane.showInputDialog("Enter the radius of the sphere:");
        System.out.println(userInput);

        if (userInput.equals("")) {
            JOptionPane.showMessageDialog(null, "No value entered.\nPlease enter again...", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            final Sphere sphere = new Sphere(Double.parseDouble(userInput));

            JOptionPane.showMessageDialog(null, String.format("The area of the sphere is: %.2f\nThe volume of the sphere is: %.2f", sphere.calcArea(), sphere.calcVolume()), "Sphere", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

