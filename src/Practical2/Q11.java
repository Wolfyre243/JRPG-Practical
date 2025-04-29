package Practical2;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        
        double gradePts = 0;
        double credUnits = 0;
        double totalGradePoints = 0;
        int totalCredUnits = 0;

        Map<String, Integer> gradeMap = new HashMap<String, Integer>();
        gradeMap.put("A", 4);
        gradeMap.put("B", 3);
        gradeMap.put("C", 2);
        gradeMap.put("D", 1);

        String userInput = "";

        while (!userInput.equals("0")) {
            System.out.printf("Enter grade for module #%d (or enter 0 to stop): ", ++count);
            userInput = input.next();

            if (!userInput.equals("0")) {
                gradePts = gradeMap.get(userInput);
                System.out.printf("Enter credit units for module #%d: ", count);
                credUnits = Integer.parseInt(input.next());

                totalGradePoints += gradePts * credUnits;
                totalCredUnits += credUnits;
            }
        }

        input.close();

        final double GPA = totalGradePoints / totalCredUnits;

        System.out.printf("Your total Credit units: %d\n", totalCredUnits);
        System.out.printf("Your GPA is %.2f", GPA);
        
    }
}
