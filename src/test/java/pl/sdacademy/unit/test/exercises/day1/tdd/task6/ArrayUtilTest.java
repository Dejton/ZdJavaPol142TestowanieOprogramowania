package pl.sdacademy.unit.test.exercises.day1.tdd.task6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilTest {
    @Test
    void shouldWorkWhenThereIsNoDuplicates() {
//        given
        String[] arr = {"Java", "Python", "PHP", "C#"};
        String[] expected = {"Java", "Python", "PHP", "C#"};
//        when
        String[] result = ArrayUtil.removeDuplicates(arr);
//        then
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void shouldWorkWhenThereIsOneDuplicate() {
//        given
        String[] arr = {"Java", "Python", "PHP", "C#", "Python"};
        String[] expected = {"Java", "Python", "PHP", "C#"};
//        when
        String[] result = ArrayUtil.removeDuplicates(arr);
//        then
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void shouldWorkWhenThereIsDoubleDuplicate() {
//        given
        String[] arr = {"Java", "Python", "PHP", "C#", "PHP", "Python", "PHP"};
        String[] expected = {"Java", "Python", "PHP", "C#"};
//        when
        String[] result = ArrayUtil.removeDuplicates(arr);
//        then
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void shouldWorkWhenIsEmpty() {
//        given
        String[] arr = {};
        String[] expected = {};
//        when
        String[] result = ArrayUtil.removeDuplicates(arr);
//        then
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void shouldWorkWhenThereIsNull() {
//        given
        String[] arr = null;
        String[] expected = null;
//        when
        String[] result = ArrayUtil.removeDuplicates(arr);
//        then
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void shouldWorkWhenThereIsSingleElement() {
//        given
        String[] arr = {"Java"};
        String[] expected = {"Java"};
//        when
        String[] result = ArrayUtil.removeDuplicates(arr);
//        then
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void shouldWorkWhenThereIsSingleElementButDuplicate() {
//        given
        String[] arr = {"Java", "Java"};
        String[] expected = {"Java"};
//        when
        String[] result = ArrayUtil.removeDuplicates(arr);
//        then
        assertThat(result).isEqualTo(expected);
    }

}