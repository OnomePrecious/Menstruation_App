package Exercises;

import Exercises.MaximumProduct;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumProductTest {

    @Test
    public void test_maxiNumberInAnArray() {
        int[] numbers = { 1, -5};
       int result = -5;
       assertEquals(result, MaximumProduct.maxiNumberInArray(numbers));

    }
}

