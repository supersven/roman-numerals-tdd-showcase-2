package org.supersven.kata.numerals.roman;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class RomanNumeralsRangeTest {

    @Parameterized.Parameters(name = "{0}")
    public static List<Integer> data() {
        return Arrays.asList(0, 5000);
    }

    private int arabic;

    public RomanNumeralsRangeTest(int arabic) {
        this.arabic = arabic;
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_not_convert() {
        RomanNumerals.convert(arabic);
    }
}
