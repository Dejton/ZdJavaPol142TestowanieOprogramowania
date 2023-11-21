package pl.sdacademy.unit.test.exercises.day1.unit.task4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
//    private Person person = new Person();

    @Test
    void thatPersonIsAChild() {
//        given
        Person person = new Person("Kamil", "Kowalski", 6);
//        when
        boolean result = person.isChild();
//        then
//        assertTrue(result);
        assertThat(result).isTrue();
    }


    @Test
    void thatPersonIsNotAChild() {
        //        given
        Person person = new Person("Kamil", "Kowalski", 19);
//        when
        boolean result = person.isChild();
//        then
//        assertFalse(result);
        assertThat(result).isFalse();
    }

}