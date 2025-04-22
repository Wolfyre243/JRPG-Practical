package Practical2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q5 {
    private static Scanner input = new Scanner(System.in);
    private static HashMap<Double, String> gradeMap = new HashMap<Double, String>();

    public static void main(String[] args) {
        ArrayList<Integer> scoreList = new ArrayList<Integer>();
        int userInput = 0;
        int sum = 0;
        String grade = "";

        gradeMap.put(49.0, "F");
        gradeMap.put(50.0, "D");
        gradeMap.put(60.0, "C");
        gradeMap.put(70.0, "B");
        gradeMap.put(80.0, "A");

        while (userInput >= 0) {
            System.out.print(String.format("Enter score # %s (or enter -1 to stop): ", scoreList.size() + 1));
            userInput = input.nextInt();
            if (userInput >= 0) {
                scoreList.add(userInput);
            }
        }

        // Sum scores
        for (int n : scoreList) {
            sum += n;
        }

        final double avgScore = sum / scoreList.size();

        for (Map.Entry<Double, String> entry : gradeMap.entrySet()) {
            System.out.println(entry.getKey());
            if (avgScore <= entry.getKey()) {
                grade = entry.getValue();
            }
        }

        System.out.println(String.format("Average Score: %s Grade: %s", avgScore, grade));

    }
}
