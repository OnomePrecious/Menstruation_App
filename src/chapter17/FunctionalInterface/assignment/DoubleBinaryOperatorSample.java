package chapter17.FunctionalInterface.assignment;

import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorSample {
    public static void main(String[] args) {
        DoubleBinaryOperator doubleBinaryOperator = (number, num) -> number / num;
        System.out.println(doubleBinaryOperator.applyAsDouble(50, 10));
    }
}
