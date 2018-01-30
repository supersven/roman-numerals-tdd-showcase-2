package org.supersven.kata.numerals.roman;

public class RomanNumerals {

    public static String convert(int arabic) {
        String result = "";

        if (arabic == 5) {
            result = "V";
            arabic = arabic - 5;
        }

        if (arabic == 4) {
            result = "IV";
            arabic = arabic - 4;
        }

        while (arabic > 0) {
            result = result + "I";
            arabic = arabic - 1;
        }

        return result;
    }
}
