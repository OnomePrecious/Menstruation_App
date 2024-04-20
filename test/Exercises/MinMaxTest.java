package Exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinMaxTest {

    @Test
    public void maxNumber() {
        int[] numbers = {1, 2, 6, 4, 7};
        assertEquals(7, MinMax.maxNumber(numbers));
    }

    @Test
    public void miniNumber() {
        int[] numbers = {5, 2, 6, 4, 7};
        assertEquals(2, MinMax.miniNumber(numbers));
    }


}
