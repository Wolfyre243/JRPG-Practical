package Practical2;

public class Q6 {
    // Split string by \n and get the longest sentence inside to calculate how many asterisks to put
    public static String personalInfo() {
        return "John Tan\nAge: Forever 21!\nSex: Male\nLocation: Singapore\nMarital Status: Single and always available";
    }

    public static String asterisks(int num) {
        return "*".repeat(num);
    }
    public static void main(String[] args) {
        System.out.println(asterisks(43));
        System.out.println(personalInfo());
        System.out.println(asterisks(43));
    }
}
