/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical2;

import java.util.Scanner;

/**
 *
 * @author wolfy
 */

public class Q1 {
    public static void main(String args[]) {
        // Score weightages
        final double mstWeight = 0.20;
        final double assign1Weight = 0.25;
        final double assign2Weight = 0.35;
        final double generalPerfWeight = 0.20;

        // Score variables
        int mstScore;
        int assign1Score;
        int assign2Score;
        int generalPerfScore;

        Scanner input = new Scanner(System.in);
        // DecimalFormat dec = new DecimalFormat("#.00");

        System.out.println("Enter MST Score: ");
        mstScore = input.nextInt();
        System.out.println("Enter Assignment 1 Score: ");
        assign1Score = input.nextInt();
        System.out.println("Enter Assignment 2 Score: ");
        assign2Score = input.nextInt();
        System.out.println("Enter General Performance Score: ");
        generalPerfScore = input.nextInt();

        final double finalScore = mstScore * mstWeight + assign1Score * assign1Weight + assign2Score * assign2Weight + generalPerfScore * generalPerfWeight;

        System.out.printf("Your final score is: %.2f", finalScore);
        input.close();
    }
}
