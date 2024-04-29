package Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddingLastIndexTest {

    @Test
  public void addIndex() {
        int[] input = {5, 2, 3, 1, 2};
        int[] output = {5, 2, 3, 1, 3};
        assertArrayEquals(output, AddingLastIndex.addIndex(input));
    }
}