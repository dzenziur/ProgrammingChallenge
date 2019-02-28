package tasks;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    private static final int MAX_NUMBER = 100;

    public static void main(String[] args) {
        int findNumber = new Random().nextInt(MAX_NUMBER) + 1;
        Scanner scanner = new Scanner(System.in);
        int userTries = 0, userGuess = 0;

        while (findNumber != userGuess) {
            System.out.println("Enter number between 1 and " + MAX_NUMBER + ": ");
            userGuess = scanner.nextInt();
            userTries++;

            if (userGuess < 1 || userGuess > MAX_NUMBER) {
                System.out.println("Enter number between 1 and " + MAX_NUMBER + ": ");
            } else if (userGuess > findNumber) System.out.println("You are too high!");
            else if (userGuess < findNumber) System.out.println("You are too low!");
        }

        scanner.close();
        System.out.println("Congratulations! You found the number " + findNumber + " in " + userTries + " tries.");

    }
}
