package pl.sdacademy.unit.test.exercises.day1.tdd.task5;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EmailValidationTest {

    @Test
    void shouldReturnTrueWhenThereIsDotInside() {
//        given
        String mail = "patryk.firlus@gmail.com";
//        when
        boolean result = EmailValidation.validator(mail);
//        then
        assertTrue(result);
    }

    @Test
    void shouldReturnTrueWhenThereIsNoDotInside() {
//        given
        String mail = "patryk@gmail.com";
//        when
        boolean result = EmailValidation.validator(mail);
//        then
        assertTrue(result);
    }

    @Test
    void shouldReturnTrueWhenThereIsSdaAfterMonkee() {
//        given
        String mail = "sda@sda.com";
//        when
        boolean result = EmailValidation.validator(mail);
//        then
        assertTrue(result);
    }

    @Test
    void shouldReturnTrueWhenThereAreNumbersBeforeMonkee() {
//        given
        String mail = "123patryk@o2.com";
//        when
        boolean result = EmailValidation.validator(mail);
//        then
        assertTrue(result);
    }

    @Test
    void shouldReturnTrueWhenThereAreOnlyNumbers() {
//        given
        String mail = "123456@gmail.com";
//        when
        boolean result = EmailValidation.validator(mail);
//        then
        assertTrue(result);
    }

    @Test
    void shouldReturnTrueWhenThereIsOnlyOneLetter() {
//        given
        String mail = "p@gmail.com";
//        when
        boolean result = EmailValidation.validator(mail);
//        then
        assertTrue(result);
    }

    @Test
    void shouldReturnTrueWhenThereIsSlashInside() {
//        given
        String mail = "patryk/firlus@gmail.com";
//        when
        boolean result = EmailValidation.validator(mail);
//        then
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenThereIsNothingBeforeMonkee() {
//        given
        String mail = "@gmail.com";
//        when
        boolean result = EmailValidation.validator(mail);
//        then
        assertFalse(result);
    }
    @Test
    void shouldReturnFalseWhenThereIsNothingAfterMonkee() {
//        given
        String mail = "sda@";
//        when
        boolean result = EmailValidation.validator(mail);
//        then
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenThereIsNull() {
//        given
        String mail = null;
//        when
        boolean result = EmailValidation.validator(mail);
//        then
        assertNotNull(result);
    }
@Test
void shouldReturnFalseWhenIsEmpty() {
//        given
    String mail = "";
//        when
    boolean result = EmailValidation.validator(mail);
//        then
    assertFalse(result);
}
    @Test
    void shouldReturnFalseWhenIsSpace() {
//        given
        String mail = " ";
//        when
        boolean result = EmailValidation.validator(mail);
//        then
        assertFalse(result);
    }
    @Test
    void shouldReturnFalseWhenTheIsOnlyDomainAfterMonkee() {
//        given
        String mail = "sda@.com";
//        when
        boolean result = EmailValidation.validator(mail);
//        then
        assertFalse(result);
    }
    @Test
    void shouldReturnFalseWhenthereAreMoreThanOneMonkees() {
//        given
        String mail = "sda@@gmail.com";
//        when
        boolean result = EmailValidation.validator(mail);
//        then
        assertFalse(result);
    }


}