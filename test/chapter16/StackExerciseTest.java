package chapter16;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StackExerciseTest {

    @Test
   public void findMinimum() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        assertEquals(1, StackExercise.findMinimum(stack));
    }

    @Test
    public void findMaximum() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(16);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        assertEquals(16, StackExercise.findMaximum(stack));

    }
}