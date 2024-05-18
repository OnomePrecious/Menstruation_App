package chapter17.FunctionalInterface.assignment;

import java.util.function.DoubleToLongFunction;

public class DoubleToLongFunctionSample {
    public static void main(String[] args) {
        DoubleToLongFunction doubleToLongFunction = (doubleNumber) -> Double.valueOf(doubleNumber).longValue();
        long number = doubleToLongFunction.applyAsLong(65.43);
        System.out.println(number);

    }
}
