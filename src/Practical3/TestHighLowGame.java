package Practical3;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

class HighLowGame {
    private int randomNumber;
    private int guess;

    // Methods
    public void generateRandomNumber(int min, int max) {
        this.randomNumber = (int) Math.floor(Math.random() * (max - min) + min);
    }

    public void getUserInput() {
        this.guess = Integer.parseInt(JOptionPane.showInputDialog("Enter your guess."));
    }

    public String getResult() {
        if (guess < randomNumber) {
            return String.format("%d is lower than the magic number", guess);
        } else if (guess > randomNumber) {
            return String.format("%d is higher than the magic number", guess);
        } else return "You are right!";
    }

    public boolean gameEnded() {
        return randomNumber == guess;
    }
}

public class TestHighLowGame {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to The High Low Number Game"); 

        final HighLowGame game = new HighLowGame();
        game.generateRandomNumber(0, 99);

        do {
            game.getUserInput();
            JOptionPane.showMessageDialog(null, game.getResult());
        } while (!game.gameEnded());
    }
}
