package org.supersven.kata.numerals.roman;

public class RomanNumerals {

    public static String convert(int arabic) {
        String result = "";

        if (arabic == 3) {
            result = result + "I";
            arabic = arabic - 1;
        }

        if (arabic == 2) {
            result = result + "I";
            arabic = arabic - 1;
        }

        if (arabic == 1) {
            result = result + "I";
            arabic = arabic - 1;
        }

        return result;
    }
}
