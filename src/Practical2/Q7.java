package Practical2;

import javax.swing.JOptionPane;

public class Q7 {
    public static double calcArea(double h, double w) {
        return h * w;
    }

    public static double calcPerimeter(double h, double w) {
        return 2 * (h + w);
    }
    public static void main(String[] args) {
        final double height = Double.parseDouble(JOptionPane.showInputDialog("Enter the Height"));
        final double width = Double.parseDouble(JOptionPane.showInputDialog("Enter the Width"));

        JOptionPane.showMessageDialog(
            null, 
            String.format("Summary of Rectangle Measurements\nHeight: %.1f\nWidth: %.1f\nArea: %.1f\nPerimeter: %.1f", height, width, calcArea(height, width), calcPerimeter(height, width)), 
            null, JOptionPane.INFORMATION_MESSAGE
        );
    }
}
