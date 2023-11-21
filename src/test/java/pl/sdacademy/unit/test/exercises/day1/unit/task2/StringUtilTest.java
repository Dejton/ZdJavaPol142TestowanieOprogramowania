package pl.sdacademy.unit.test.exercises.day1.unit.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.sdacademy.unit.test.examples.AssertionsExamples;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    /*
    gdy true:
    null
    " " / ""/"  "

    gdy false:
    "java"
    " java"
    " java "

     */

    @Test
    void shouldReturnTrueIfEmpty() {
//        given
//        boolean expected = true;

//        when
        boolean result = StringUtil.isBlank("  ");
//        then
        assertTrue(result);
//        assertThat(result).isTrue();

    }

    @Test
    void shouldReturnFalseIfNotBlank() {
        //        given
//        boolean expected = false;

//        when
        boolean result = StringUtil.isBlank(" java ");
//        then
//        assertFalse(result);
        assertThat(result).isFalse();
    }


}