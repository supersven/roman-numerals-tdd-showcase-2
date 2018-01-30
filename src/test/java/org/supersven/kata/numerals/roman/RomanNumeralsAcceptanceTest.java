package org.supersven.kata.numerals.roman;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralsAcceptanceTest {

    @Test
    public void should_convert_4999() {
        int arabic = 4999;

        String roman = RomanNumerals.convert(arabic);

        assertThat(roman).isEqualTo("MMMMCMXCIX");
    }
}
