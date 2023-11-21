package pl.sdacademy.unit.test.exercises.day1.tdd.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTddTest {
    @Test
    void shouldReturnTrueIfEmpty() {
//    when
        boolean result = StringUtilTdd.isBlank("");
//    then
        assertTrue(result);
    }
    @Test
    void shouldReturnTFalseIfNotEmpty() {
//    when
        boolean result = StringUtilTdd.isBlank("a");
//    then
        assertFalse(result);
    }

    @Test
    void shouldReturnTrueIfIsNull() {
//    when
        boolean result = StringUtilTdd.isBlank(null);
//    then
        assertTrue(result);
    }
}