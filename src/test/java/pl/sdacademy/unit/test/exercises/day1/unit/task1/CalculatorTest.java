package pl.sdacademy.unit.test.exercises.day1.unit.task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator = new Calculator();
        @BeforeEach
        void init() {
            calculator = new Calculator();
        }



    @Test
    public void shouldReturnCorrectSun() {
        //    given
        int expected = 6;
//        Calculator sum = new Calculator();

//    when
        int result = calculator.add(3, 3);

//    then
        assertEquals(expected, result);
    }

    @Test
    public void ShouldReturnCorrectSubstract() {
//        given
        int expected = 2;
//        Calculator sub = new Calculator();

//        when
        int result = calculator.subtract(6,4);

//        then
        assertEquals(expected, result);
    }
    @Test
    public void ShouldReturnCorrectMultiply() {
//        given
        int expected = 8;
        Calculator mult = new Calculator();

//        when
        int result = mult.multiply(4,2);

//        then
        assertEquals(expected,result);
    }

    @Test
    public void ShouldReturnCorrectDivide() {
//        given
        float expected = 4;
        Calculator div = new Calculator();

//        when
        float result = div.divide(16,4);

//        then
//        assertEquals(expected,result);
        assertThat(result).isEqualTo(expected);
    }



}