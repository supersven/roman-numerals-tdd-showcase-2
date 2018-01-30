package org.supersven.kata.numerals.roman;

public class RomanNumerals {

    public static String convert(int arabic) {
        if (arabic == 3) {
            return "III";
        }

        if (arabic == 2) {
            return "II";
        }

        return "I";
    }
}
