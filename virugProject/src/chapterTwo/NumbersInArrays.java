package tddClass;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumbersInArrays {
    @Test
    public void maximumNumberInArrayTest(){
    int[] scores = {34, 23, 14, 45, 23};
    assertEquals(45, Kata.findMaximumFrom(scores));

    }
    @Test
    public void minimumNumberInArrayTest() {
        int[] scores = {34, 23, 14, 45, 23};
        assertEquals(14, Kata.findMinimumFrom(scores));
    }
    @Test
    public void averageNumberInArrayTest() {
        int[] scores = {34, 23, 14, 45, 23};
        assertEquals(27, Kata.findAverageFrom(scores));
    }
}
