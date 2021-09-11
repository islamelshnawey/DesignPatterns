package com.helloworldtechs.designPattern.misc.repository;

public class ArgumentValidator {

    public static void checkForNegativity(double number, String message) {
        if (number < 0) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void checkForNull(Object object, String message) {
        if (object == null) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void checkForNullOrEmptyString(String string, String message) {
        if (string == null || string.isEmpty()) {
            throw new IllegalArgumentException(message);
        }
    }
}
