package chapter17.FunctionalInterface.assignment;

import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorSample {
    public static void main(String[] args) {
        IntBinaryOperator intBinaryOperator = (firstNumber, secondNumber) -> firstNumber / secondNumber ;
        int result = intBinaryOperator.applyAsInt(200, 20);
        System.out.println(result);
    }
}
