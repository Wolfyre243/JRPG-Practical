package Practical2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q3 {

    private static Scanner input = new Scanner(System.in);
    private static HashMap<Double, String> bmiRange = new HashMap<Double, String>();

    private static String getRange(double bmi) {
        String bmiStr = "Invalid BMI!";

        bmiRange.put(18.5, "Underweight");
        bmiRange.put(24.9, "Normal");
        bmiRange.put(29.9, "Overweight");

        for (Map.Entry<Double, String> entry : bmiRange.entrySet()) {
            if (bmi <= entry.getKey()) {
                bmiStr = entry.getValue();
            }
        }

        return bmiStr;
    }

    public static void metricImperialCalc() {
        double weight;
        double height;

        System.out.print("Enter your weight in kilograms: ");
        weight = input.nextDouble();
        System.out.print("Enter your height in metres (e.g. 1.75): ");
        height = input.nextDouble();

        double bmi = Math.round((weight / Math.pow(height, 2)) * 10.0) / 10.0;

        System.out.println(String.format("Your BMI is %s and you are %s", bmi, getRange(bmi)));
    }

    public static void imperialCalc() {
        double weight;
        double height;

        System.out.print("Enter your weight in pounds: ");
        weight = input.nextDouble();
        System.out.print("Enter your height in inches: ");
        height = input.nextDouble();

        double bmi = Math.round(((weight * 703) / Math.pow(height, 2)) * 10.0) / 10.0;

        System.out.println(String.format("Your BMI is %s and you are %s", bmi, getRange(bmi)));
    }

    public static void main(String args[]) {
        int option;
        System.out.print("Enter your option:\n1) Metric Imperial\n2) Imperial\n>> ");
        option = input.nextInt();

        if (option == 1) {
            metricImperialCalc();
        } else imperialCalc();
    }
}
