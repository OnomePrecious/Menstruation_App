package chapter17.FunctionalInterface.assignment;

import java.util.function.DoubleUnaryOperator;

public class DoubleUnaryOperatorSample {
    public static void main(String[] args) {
        DoubleUnaryOperator doubleUnaryOperator = (number) -> 2 * number;
        double number = doubleUnaryOperator.applyAsDouble(76.89);
        System.out.println(number);


    }
}