package tasks;

import java.util.Scanner;

public class T35_CurrencyConverter {
    public static void main(String[] args) {
        System.out.println("Enter currency to convert: \n1.PLN\n2.USD\n3.EUR\n");
        System.out.println("Enter amount of money to convert:");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        System.out.println(convertEurToPln(230));
    }

    private strictfp static double convertUsdToPln(double usd) {
        return usd * 3.787;
    }

    private strictfp static double convertPlnToUsd(double pln) {
        return pln * 0.264;
    }

    private strictfp static double convertEurToPln(double eur) {
        return eur * 4.309;
    }

    private strictfp static double convertPlnToEur(double pln) {
        return pln * 0.232;
    }

    private strictfp static double convertEurToUsd(double eur) {
        return eur * 1.137;
    }

    private strictfp static double convertUsdToEur(double usd) {
        return usd * 0.878;
    }
}
