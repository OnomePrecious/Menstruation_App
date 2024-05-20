package chapter17.FunctionalInterface.assignment;

import java.util.function.LongBinaryOperator;

public class LongBinaryOperatorSample {
    public static void main(String[] args) {
        LongBinaryOperator longBinaryOperator = Long::sum;
        System.out.println(longBinaryOperator.applyAsLong(50, 10));
    }
}
