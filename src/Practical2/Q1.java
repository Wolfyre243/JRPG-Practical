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
        double mstScore;
        double assign1Score;
        double assign2Score;
        double generalPerfScore;

        Scanner input = new Scanner(System.in);
        // DecimalFormat dec = new DecimalFormat("#.00");

        System.out.println("Enter MST Score: ");
        mstScore = input.nextDouble();
        System.out.println("Enter Assignment 1 Score: ");
        assign1Score = input.nextDouble();
        System.out.println("Enter Assignment 2 Score: ");
        assign2Score = input.nextDouble();
        System.out.println("Enter General Performance Score: ");
        generalPerfScore = input.nextDouble();

        final double finalScore = mstScore * mstWeight + assign1Score * assign1Weight + assign2Score * assign2Weight + generalPerfScore * generalPerfWeight;

        System.out.printf("Your final score is: %.2f", finalScore);
        input.close();
    }
}
