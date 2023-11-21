package pl.sdacademy.unit.test.exercises.day1.unit.task3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {

    @Test
    void shouldReturnCorrectDateAsString() {
//        given
        DateFormatter dateFormatter = new DateFormatter();
        LocalDate input = LocalDate.of(1970, 1, 13);
        String expected = "1970-13-01";
//        when
        String result = dateFormatter.formatDate(input);
//        then
        assertEquals(expected, result);
    }

}