package chapter17.FunctionalInterface.assignment;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorSample {
    public static void main(String[] args) {
        IntUnaryOperator intUnaryOperator = (firstNumber) -> firstNumber / 2;
        int result = intUnaryOperator.applyAsInt(32);
        System.out.println("Result:" + result);
    }
}
