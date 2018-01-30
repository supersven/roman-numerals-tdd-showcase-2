package org.supersven.kata.numerals.roman;

public class RomanNumerals {

    public static String convert(int arabic) {
        String result = "";

        while (arabic > 0) {
            result = result + "I";
            arabic = arabic - 1;
        }

        return result;
    }
}
