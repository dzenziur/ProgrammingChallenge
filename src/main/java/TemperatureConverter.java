import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        double temperature;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want: \nConvert C --> F press 1 \nConvert F --> C press 2");
        entry:
        do {
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Enter temperature into Celsius: ");
                    temperature = scanner.nextDouble();
                    System.out.println("Temperature into Fahrenheit: " + convertTempIntoF(temperature));
                    break entry;
                case 2:
                    System.out.println("Enter temperature into Fahrenheit: ");
                    temperature = scanner.nextDouble();
                    System.out.println("Temperature into Celsius: " + convertTempIntoC(temperature));
                    break entry;
            }
        } while (true);
        scanner.close();
    }

    private static double convertTempIntoF(double temperature) {
        return temperature * 1.8 + 32;
    }

    private static double convertTempIntoC(double temperature) {
        return (temperature - 32) / 1.8;
    }
}
