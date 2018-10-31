package stringmanipulation;

import com.github.javafaker.Faker;

public class NameGenerator {
    public static void main(String[] args) {
        Faker faker = new Faker();

        for (int i = 0; i < 10; i++) {
            System.out.println("Full name: " + faker.name().firstName() + " " + faker.name().lastName());
        }
    }
}
