package Practical2;

import javax.swing.JOptionPane;

public class Q2 {
    public static void main(String args[]) {
        final int pHLevel = Integer.parseInt(JOptionPane.showInputDialog("Enter the pH level of the tested water: "));
        
        if (0 <= pHLevel && pHLevel < 7) {
            JOptionPane.showMessageDialog(null, "Your aquarium water is acidic", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else if (pHLevel == 7) {
            JOptionPane.showMessageDialog(null, "Your aquarium water is neutral", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else if (7 < pHLevel && pHLevel <= 14) {
            JOptionPane.showMessageDialog(null, "Your aquarium water is alkaline", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid pH Level!", "Message", JOptionPane.ERROR_MESSAGE);
        }
    }
}
