package pl.sdacademy.unit.test.exercises.day1.tdd.task6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayUtil {
    public static String[] removeDuplicates(String[] array) {
        if (array == null) return null;
        Set<String> result = new LinkedHashSet<>(List.of(array));
        return result.toArray(new String[0]);
    }

}