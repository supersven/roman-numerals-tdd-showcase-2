package org.supersven.kata.numerals.roman;

public class RomanNumerals {

    public static String convert(int arabic) {
        String result = "";

        while (arabic >= 10) {
            result = result + "X";
            arabic = arabic - 10;
        }

        while (arabic >= 9) {
            result = result + "IX";
            arabic = arabic - 9;
        }

        while (arabic >= 5) {
            result = result + "V";
            arabic = arabic - 5;
        }

        while (arabic >= 4) {
            result = result + "IV";
            arabic = arabic - 4;
        }

        while (arabic >= 1) {
            result = result + "I";
            arabic = arabic - 1;
        }

        return result;
    }
}
