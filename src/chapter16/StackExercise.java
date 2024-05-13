package chapter16;

import java.util.Stack;

public class StackExercise {
    public static int findMinimum(Stack<Integer> numbers){
        int minimum = Integer.MAX_VALUE;
        for(int num: numbers){
            if(num < minimum) minimum = num;
        }
        return minimum;
    }


        public static int findMaximum(Stack<Integer> numbers){
        int maximum = Integer.MIN_VALUE;
        for(int num: numbers){
            if(num > maximum) maximum = num;

        }
            return maximum;
        }
    }


