package org.supersven.kata.numerals.roman;

import java.util.Arrays;
import java.util.List;

public class RomanNumerals {

    private static final List<RomanNumeral> romanNumerals = Arrays.asList(
            new RomanNumeral("M", 1000),
            new RomanNumeral("CM", 900),
            new RomanNumeral("D", 500),
            new RomanNumeral("CD", 400),
            new RomanNumeral("C", 100),
            new RomanNumeral("XC", 90),
            new RomanNumeral("L", 50),
            new RomanNumeral("XL", 40),
            new RomanNumeral("X", 10),
            new RomanNumeral("IX", 9),
            new RomanNumeral("V", 5),
            new RomanNumeral("IV", 4),
            new RomanNumeral("I", 1)
    );

    private static class RomanNumeral {

        private String symbol;
        private int arabic;

        RomanNumeral(String symbol, int arabic) {
            this.symbol = symbol;
            this.arabic = arabic;
        }

        String getSymbol() {
            return symbol;
        }

        int getArabic() {
            return arabic;
        }
    }

    public static String convert(int arabic) {
        if (arabic < 1 || arabic > 4999) {
            throw new IllegalArgumentException("input range: [1,4999]");
        }

        String result = "";

        for (RomanNumeral numeral : romanNumerals) {
            while (arabic >= numeral.getArabic()) {
                result = result + numeral.getSymbol();
                arabic = arabic - numeral.getArabic();
            }
        }

        return result;
    }
}
