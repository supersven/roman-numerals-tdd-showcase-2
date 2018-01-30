package org.supersven.kata.numerals.roman;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralsTest {

    @Test
    public void should_convert_1() {
        int arabic = 1;

        String roman = RomanNumerals.convert(arabic);

        assertThat(roman).isEqualTo("I");
    }

    @Test
    public void should_convert_2() {
        int arabic = 2;

        String roman = RomanNumerals.convert(arabic);

        assertThat(roman).isEqualTo("II");
    }

    @Test
    public void should_convert_3() {
        int arabic = 3;

        String roman = RomanNumerals.convert(arabic);

        assertThat(roman).isEqualTo("III");
    }

    @Test
    public void should_convert_4() {
        int arabic = 4;

        String roman = RomanNumerals.convert(arabic);

        assertThat(roman).isEqualTo("IV");
    }
}
