package Practical2;

import java.util.Arrays;
import java.util.Scanner;

public class Q10 {
    public static void main_ptAB(String[] args) {
        int[] intArray = new int[]{11, 0, 10, 2, 2};

        int highest = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > highest) {
                highest = intArray[i];
            }
        }

        System.out.printf("Elements of int array: %s\n", Arrays.toString(intArray));
        System.out.printf("Highest Element: %d", highest);
    }

    // switch to "main" to run
    public static void main(String[] args) {
        int[] intArray = new int[5];
        Scanner input = new Scanner(System.in);

        int highest = 0;
        for (int i = 0; i < intArray.length; i++) {
            System.out.printf("Enter the value for intArray[%d] -> ", i);
            intArray[i] = input.nextInt();

            if (intArray[i] > highest) {
                highest = intArray[i];
            }
        }

        System.out.printf("Elements of intArray: %s\n", Arrays.toString(intArray));
        System.out.printf("Highest Element: %d", highest);
    }
}
