package Practical2;

import javax.swing.JOptionPane;

// import java.util.Scanner;

public class Q4 {

    // private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        final int userInput = Integer.parseInt(JOptionPane.showInputDialog("Enter a numeric value from 1 - 10: "));

        if (userInput < 1 || userInput > 10) {
            JOptionPane.showMessageDialog(null, "Out of Range! Please enter a number between 1 to 10!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String numeral = "";

        switch (userInput) {
            case 1:
                numeral = "I";
                break;
            
            case 2:
                numeral = "II";
                break;

            case 3:
                numeral = "III";
                break;
                
            case 4:
                numeral = "IIII";
                break;
                
            case 5:
                numeral = "V";
                break;

            case 6:
                numeral = "VI";
                break;

            case 7:
                numeral = "VII";
                break;

            case 8:
                numeral = "VIII";
                break;

            case 9:
                numeral = "VIII";
                break;

            case 10:
                numeral = "X";
                break;

            default:
                break;
        }
        
        JOptionPane.showMessageDialog(null, String.format("Roman Numeral Value = %s", numeral), "Message", JOptionPane.INFORMATION_MESSAGE);
        
    }
}
