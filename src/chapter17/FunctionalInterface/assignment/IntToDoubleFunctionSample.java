package chapter17.FunctionalInterface.assignment;

import java.util.function.IntToDoubleFunction;

public class IntToDoubleFunctionSample {
    public static void main(String[] args) {
        IntToDoubleFunction intToDoubleFunction = (number) -> Integer.valueOf(number).doubleValue();
        double number = intToDoubleFunction.applyAsDouble(808);
        System.out.println(number);

    }
}
