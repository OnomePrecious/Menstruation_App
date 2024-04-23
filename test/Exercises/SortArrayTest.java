package Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayTest {

    @Test
  public void testTheSortArray() {
        int [] input = {0, 0, 8, 9, 2};
        int [] output = {8, 9, 2, 0, 0};
        assertArrayEquals(output, SortArray.greaterProduct(input));

    }
}