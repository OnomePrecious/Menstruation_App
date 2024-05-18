package chapter17.FunctionalInterface.assignment;

import java.util.function.DoublePredicate;

public class DoublePredicateSample {
    public static void main(String[] args) {
        DoublePredicate doublePredicate = number -> number == 10.87;
        double number = 10.87;
        boolean result = doublePredicate.test(number);
        System.out.println("Result: " + result);
    }
        }

