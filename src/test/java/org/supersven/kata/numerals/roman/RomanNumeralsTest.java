package org.supersven.kata.numerals.roman;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class RomanNumeralsTest {

    @Parameterized.Parameters(name = "{0} -> {1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, "I"},
                {2, "II"},
                {3, "III"},
                {4, "IV"},
                {5, "V"},
                {6, "VI"},
                {9, "IX"},
                {10, "X"},
                {11, "XI"},
                {14, "XIV"},
                {15, "XV"},
                {19, "XIX"},
                {20, "XX"},
                {40, "XL"},
                {50, "L"},
                {90, "XC"},
                {100, "C"},
                {400, "CD"},
                {500, "D"},
                {900, "CM"},
                {1000, "M"},
        });
    }

    private int arabic;
    private String expectedRoman;

    public RomanNumeralsTest(int arabic, String expectedRoman) {
        this.arabic = arabic;
        this.expectedRoman = expectedRoman;
    }

    @Test
    public void should_convert() {
        String roman = RomanNumerals.convert(arabic);

        assertThat(roman).isEqualTo(expectedRoman);
    }
}
