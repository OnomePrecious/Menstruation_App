package chapter17.FunctionalInterface.assignment;

import java.util.function.IntPredicate;

public class IntPredicateSample {
    public static void main(String[] args) {
        IntPredicate intPredicate = number -> number > 100;
        int value = 54;
        System.out.println(intPredicate.test(value));
    }
}
