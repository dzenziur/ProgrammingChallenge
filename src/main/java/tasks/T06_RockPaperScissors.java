package tasks;

import java.util.Random;
import java.util.Scanner;

public class T06_RockPaperScissors {
    public static void main(String[] args) {
        startGame();
    }

    private enum Move {
        ROCK, PAPER, SCISSORS;

        public int compareMoves(Move userMove, Move computerMove) {
            if (userMove == computerMove)
                return 0;

            switch (userMove) {
                case ROCK:
                    return (computerMove == SCISSORS ? 1 : -1);
                case PAPER:
                    return (computerMove == ROCK ? 1 : -1);
                case SCISSORS:
                    return (computerMove == PAPER ? 1 : -1);
            }

            return 0;
        }
    }

    private static Move randomDraw() {
        return Move.values()[new Random().nextInt(Move.values().length)];
    }

    private static void compareMove(Move userMove) {
        Move computerMove = randomDraw();
        int compareMoves = userMove.compareMoves(userMove, computerMove);
        switch (compareMoves) {
            case 0: // Tie
                System.out.println(userMove + "\t\t\t" + computerMove + " \t\t\tTie!");
                break;
            case 1: // User wins
                System.out.println(userMove + "\t\t\t" + computerMove + " \t\t\tYou won!");
                break;
            case -1: // Computer wins
                System.out.println(userMove + "\t\t\t" + computerMove + ". \t\t\tYou lost.");
                break;
        }
    }

    private static void startGame() {
        System.out.println("Let`s play Rock, Paper, Scissor!");
        System.out.println("Enter your move.\nRock --> R\nPaper --> P\nScissor --> S\nQuit --> Q");
        System.out.println("User move:\t\t\tComputer move:\t\tWinner:");
        Scanner scanner = new Scanner(System.in);
        entry:
        do {
            String move = scanner.nextLine();

            switch (move.toUpperCase()) {
                case "R":
                    compareMove(Move.ROCK);
                    break;
                case "P":
                    compareMove(Move.PAPER);
                    break;
                case "S":
                    compareMove(Move.SCISSORS);
                    break;
                case "Q":
                    break entry;
                default:
                    System.out.println("Enter your move once again!\nRock --> R\nPaper --> P" +
                            "\nScissor --> S\nQ --> Quit");
                    break;
            }
        } while (true);

        scanner.close();
    }
}
