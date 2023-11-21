package pl.sdacademy.unit.test.exercises.day1.tdd.task2;

public class StringUtilTdd {

    public static boolean isBlank(String input) {
        return input == null || input.trim().isEmpty();
    }
}