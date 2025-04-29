package Practical2;

public class Q9 {
    public static void main(String[] args) {
        int[] numberArray = new int[100];

        for (int i = 0; i < numberArray.length; i++) {
            // Odd
            if (i % 2 != 0) {
                numberArray[i] = 1;
                System.out.printf("numberArray[%d] = 1\n", i);
            } else {
                numberArray[i] = 2;
                System.out.printf("numberArray[%d] = 2\n", i);
            }
        }
    }
}
