package pl.sdacademy.unit.test.exercises.day1.tdd.task1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    void shouldReturnFibonacciWhenIndexIs0() {
//        given
        Fibonacci fibonacci = new Fibonacci();
        int expected = 0;
//        when
        int result = fibonacci.getValueFromIndex(0);
//        then
        assertThat(result).isEqualTo(expected);

    }

    @Test
    void shouldReturnFibonacciWhenIndexIs1() {
//        given
        Fibonacci fibonacci = new Fibonacci();
        int expected = 1;
//        when
        int result = fibonacci.getValueFromIndex(1);
//        then
        assertThat(result).isEqualTo(expected);

    }

    @Test
    void shouldReturnFibonacciWithIndex6() {
//        given
        Fibonacci fibonacci = new Fibonacci();
        int expected = 8;
//        when
        int result = fibonacci.getValueFromIndex(6);
//        then
        assertThat(result).isEqualTo(expected);

    }

}