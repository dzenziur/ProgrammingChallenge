package tasks;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    Fibonacci number – Every number after the first two is the sum of the two preceding.
 */
public class T27_FibonacciSequence {
    public static void main(String[] args) {
        int number = scanNumber();
//        printSequence(number);
        printSequenceStream(number);
    }

    private static long getFibonacci(long l) {
        if (l <= 1) return l;
        else return getFibonacci(l - 1) + getFibonacci(l - 2);
    }

    private static int scanNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        return scanner.nextInt();
    }

    private static void printSequence(int number) {
        System.out.println("Result: ");
        for (int i = 0; i < number; i++) {
            System.out.print(getFibonacci(i) + " ");
        }
    }

    private static void printSequenceStream(int number) {
        String collect = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(number)
                .map(t -> t[0])
                .map(String::valueOf) // convert to string
                .collect(Collectors.joining(" "));

        System.out.println("Result : " + collect);
    }

}
