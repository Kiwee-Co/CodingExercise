package exercise.coding101.kiwee.conditional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import exercise.coding101.kiwee.conditional.Main.Status;

public class MainTest {

    @ParameterizedTest
    @ValueSource(ints = { 2000, 2004, 2008, 2012, 2016, 2020, 2024 })
    void testLeapYear(int year) {
        assertTrue(Main.leapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = { 1700, 1900, 2005, 2009, 2011, 2017, 2023, 2025 })
    void testNotLeapYear(int year) {
        assertFalse(Main.leapYear(year));
    }

    @ParameterizedTest
    @CsvSource({ "123,Positive", "-456,Negative", "0, Zero" })
    void testCheckStatus(String num, String result) {
        var number = Integer.valueOf(num);
        var status = Status.valueOf(result);

        assertEquals(status, Main.numberStatusCheck(number));
    }

    @ParameterizedTest
    @MethodSource("provideData")
    void testNumberCheck(int num, String contains) {
        assertTrue(StringUtils.contains(Main.numberCheck(num), contains));
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(Arguments.of(123, "positive"), Arguments.of(-2, "hello?"), Arguments.of(0, "hello?"));
    }
}
