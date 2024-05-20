package chapter17.FunctionalInterface.assignment;

import java.util.function.LongPredicate;

public class LongPredicateSample {
    public static void main(String[] args) {
        LongPredicate longPredicate = number -> number > 30;
        System.out.println(longPredicate.test(50));
    }
}
