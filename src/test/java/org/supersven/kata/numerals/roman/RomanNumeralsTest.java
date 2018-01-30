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

    @Test
    public void should_convert_5() {
        int arabic = 5;

        String roman = RomanNumerals.convert(arabic);

        assertThat(roman).isEqualTo("V");
    }

    @Test
    public void should_convert_6() {
        int arabic = 6;

        String roman = RomanNumerals.convert(arabic);

        assertThat(roman).isEqualTo("VI");
    }

    @Test
    public void should_convert_9() {
        int arabic = 9;

        String roman = RomanNumerals.convert(arabic);

        assertThat(roman).isEqualTo("IX");
    }

    @Test
    public void should_convert_10() {
        int arabic = 10;

        String roman = RomanNumerals.convert(arabic);

        assertThat(roman).isEqualTo("X");
    }

    @Test
    public void should_convert_11() {
        int arabic = 11;

        String roman = RomanNumerals.convert(arabic);

        assertThat(roman).isEqualTo("XI");
    }

    @Test
    public void should_convert_14() {
        int arabic = 14;

        String roman = RomanNumerals.convert(arabic);

        assertThat(roman).isEqualTo("XIV");
    }

    @Test
    public void should_convert_15() {
        int arabic = 15;

        String roman = RomanNumerals.convert(arabic);

        assertThat(roman).isEqualTo("XV");
    }

    @Test
    public void should_convert_19() {
        int arabic = 19;

        String roman = RomanNumerals.convert(arabic);

        assertThat(roman).isEqualTo("XIX");
    }

    @Test
    public void should_convert_20() {
        int arabic = 20;

        String roman = RomanNumerals.convert(arabic);

        assertThat(roman).isEqualTo("XX");
    }

    @Test
    public void should_convert_40() {
        int arabic = 40;

        String roman = RomanNumerals.convert(arabic);

        assertThat(roman).isEqualTo("XL");
    }

    @Test
    public void should_convert_50() {
        int arabic = 50;

        String roman = RomanNumerals.convert(arabic);

        assertThat(roman).isEqualTo("L");
    }

    @Test
    public void should_convert_90() {
        int arabic = 90;

        String roman = RomanNumerals.convert(arabic);

        assertThat(roman).isEqualTo("XC");
    }

    @Test
    public void should_convert_100() {
        int arabic = 100;

        String roman = RomanNumerals.convert(arabic);

        assertThat(roman).isEqualTo("C");
    }

    @Test
    public void should_convert_400() {
        int arabic = 400;

        String roman = RomanNumerals.convert(arabic);

        assertThat(roman).isEqualTo("CD");
    }

    @Test
    public void should_convert_500() {
        int arabic = 500;

        String roman = RomanNumerals.convert(arabic);

        assertThat(roman).isEqualTo("D");
    }
}
