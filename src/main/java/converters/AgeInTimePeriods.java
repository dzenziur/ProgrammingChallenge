package converters;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeInTimePeriods {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate bDay = getBDayDate(1996, 7, 26);
        Period lifePeriod = calculateLifePeriod(bDay, today);
        System.out.println("Current date: " + today);
        System.out.println("Your birthday date: " + bDay);
        System.out.println("Life period(years-month-days): " + lifePeriod.getYears() + "Y" + lifePeriod.getMonths() +
                "M" + lifePeriod.getDays() + "D");
        System.out.println("Life in months: " + calculateAgeInMonths(lifePeriod) + " months.");
        System.out.println("Life in days: " + calculateAgeInDays(lifePeriod) + " days.");
        System.out.println("Life in hours: " + calculateAgeInHours(lifePeriod) + " hours.");
        System.out.println("Life in minutes: " + calculateAgeInMinutes(lifePeriod) + " minutes.");
        System.out.println("Life in seconds: " + calculateAgeInSeconds(lifePeriod) + " seconds.");
    }

    private static long calculateAgeInMonths(Period period) {
        return period.getYears() * 12 + period.getMonths();
    }

    private static long calculateAgeInDays(Period period) {
        return period.getDays() + period.getMonths() * 30 + period.getYears() * 12 * 30;
    }

    private static long calculateAgeInHours(Period period) {
        return period.getYears() * 12 * 30 * 24 + period.getMonths() * 30 * 24 + period.getDays() * 24;
    }

    private static long calculateAgeInMinutes(Period period) {
        return period.getYears() * 12 * 30 * 24 * 60 + period.getMonths() * 30 * 24 * 60 + period.getDays() * 24 * 60;
    }

    private static long calculateAgeInSeconds(Period period) {
        return period.getYears() * 12 * 30 * 24 * 60 * 60 + period.getMonths() * 30 * 24 * 60 * 60 + period.getDays()
                * 24 * 60 * 60;
    }

    private static Period calculateLifePeriod(LocalDate startDate, LocalDate endDate) {
        return Period.between(startDate, endDate);
    }

    private static LocalDate getBDayDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birthday date into format year/month/day one by one: ");
        LocalDate bDay = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        scanner.close();
        return bDay;
    }

    private static LocalDate getBDayDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }
}
