package chapter17.FunctionalInterface.assignment;

import java.util.function.IntToLongFunction;

public class IntToLongFunctionSample {
    public static void main(String[] args) {
        IntToLongFunction intToLongFunction = (number) -> Integer.valueOf(number).longValue();
        long longNumber = intToLongFunction.applyAsLong(1000);
        System.out.println(longNumber);
    }
}
