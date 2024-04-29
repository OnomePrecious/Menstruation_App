package Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddingWithoutUsingPlusOperatorTest {

    @Test
    public void test_operator() {
        int input = 10;
        int secondInput = 5;
        int result = 15;
        assertEquals(result, AddingWithoutUsingPlusOperator.numbers(input, secondInput));
    }
}