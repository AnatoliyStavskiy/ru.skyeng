package ru.skyeng.util;

import com.github.javafaker.Faker;

import java.util.Random;

public class GenerationDataUtil {

    public static String generateName() {
        Faker faker = new Faker();
        return faker.name().name();
    }

    public static String generateEmail() {
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }

    public static String generateRussiaMobilePhone() {
        Random random = new Random();
        String countryCode = "+7";
        int[] mobileCodes = {945, 971, 993, 953, 940, 948, 941, 906, 919, 937, 932, 930, 914, 934, 972};
        int code = mobileCodes[random.nextInt(mobileCodes.length)];
        int number = 1000000 + random.nextInt(9000000);
        return String.format("%s%d%07d", countryCode, code, number);
    }
}
