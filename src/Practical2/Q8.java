package Practical2;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Q8 {
    public static int getInputSeconds(String message) {
        Scanner input = new Scanner(System.in);

        System.out.print(message);
        final int userInput = input.nextInt();
        input.close();

        return userInput;
    }

    public static Map<String, Integer> calculateTime(int seconds) {
        final Map<String, Integer> timeMap = new HashMap<String, Integer>();
        final int initialSeconds = seconds;
        timeMap.put("initialSeconds", seconds);

        int hours = 0;
        int minutes = 0;

        seconds = initialSeconds % 60;
        final int initialMinutes = (initialSeconds - seconds) / 60;
        minutes = initialMinutes % 60;
        hours = (initialMinutes - minutes) / 60;

        timeMap.put("hours", hours);
        timeMap.put("minutes", minutes);
        timeMap.put("seconds", seconds);

        return timeMap;
    } 

    public static void displayResults(Map<String, Integer> timeMap) {
        System.out.printf(
            "Time Converter\nTotal Seconds: %d\nHours: %d\nMinutes: %d\nSeconds: %d", 
            timeMap.get("initialSeconds"),
            timeMap.get("hours"),
            timeMap.get("minutes"),
            timeMap.get("seconds")
        );
    }

    public static void main(String[] args) {
        displayResults(calculateTime(getInputSeconds("Enter the total seconds: ")));
    }
}
