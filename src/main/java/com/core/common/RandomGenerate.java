package com.core.common;

import java.util.Random;

public class RandomGenerate {

    private static final String CHAR_LIST = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private static final int RANDOM_STRING_LENGTH = 12;

    public static String generateRandomString() {
        final StringBuffer randStr = new StringBuffer();
        for (int i = 0; i < RANDOM_STRING_LENGTH; i++) {
            final int number = getRandomNumber();
            final char ch = CHAR_LIST.charAt(number);
            randStr.append(ch);
        }
        return randStr.toString();
    }

    private static int getRandomNumber() {
        int randomInt = 0;
        final Random randomGenerator = new Random();
        randomInt = randomGenerator.nextInt(CHAR_LIST.length());
        if ((randomInt - 1) == -1) {
            return randomInt;
        } else {
            return randomInt - 1;
        }
    }
}
