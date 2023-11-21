package pl.sdacademy.unit.test.exercises.day1.tdd.task5;

public class EmailValidation {
public static boolean validator(String emailStr) {
    if (emailStr == null) return false;
    return emailStr.matches("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?");
}
}