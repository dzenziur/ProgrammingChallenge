package tasks;

public class T05_FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) System.out.println("Fizz ");
            else if (i % 5 == 0) System.out.println("Buzz ");
            else if (i % 3 == 0 && i % 5 == 0) System.out.println("tasks.T05_FizzBuzz ");
            else System.out.println(i + " ");
        }
    }
}
