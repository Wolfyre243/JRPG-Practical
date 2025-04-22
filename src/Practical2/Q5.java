package Practical2;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.LinkedHashMap;

public class Q5 {
    private static Scanner input = new Scanner(System.in);
    private static LinkedHashMap<Integer, String> gradeMap = new LinkedHashMap<>();

    public static void main(String[] args) {
        ArrayList<Integer> scoreList = new ArrayList<Integer>();
        int userInput = 0;
        int sum = 0;
        String grade = "";

        gradeMap.put(80, "A");
        gradeMap.put(70, "B");
        gradeMap.put(60, "C");
        gradeMap.put(50, "D");
        gradeMap.put(49, "F");

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

        for (Map.Entry<Integer, String> entry : gradeMap.entrySet()) {
            if (avgScore <= entry.getKey()) {
                grade = entry.getValue();
            }
        }

        System.out.println(String.format("Average Score: %s Grade: %s", avgScore, grade));
    }
}
