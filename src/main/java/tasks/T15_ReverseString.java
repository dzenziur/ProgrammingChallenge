package tasks;

import java.util.Scanner;

public class T15_ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter string to reverse: ");
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        reverseStringV1(expression);
        reverseStringV2(expression);
        reverseStringV3(expression);
    }

    private static void reverseStringV1(String expression) {
        for (int i = expression.length() - 1; i >= 0; i--) {
            System.out.print(expression.charAt(i));
        }
    }

    private static void reverseStringV2(String expression) {
        StringBuilder sb = new StringBuilder();
        for (int i = expression.length() - 1; i >= 0; i--) {
            sb.append(expression.charAt(i));
        }
        System.out.println(sb);
    }

    private static void reverseStringV3(String expression) {
        StringBuilder sb = new StringBuilder(expression);
        System.out.println(sb.reverse());
    }
}
