package chapter17.FunctionalInterface.assignment;

import java.util.function.DoubleFunction;

public class DoubleFunctionSample {
    public static void main(String[] args) {
        DoubleFunction<Double> doubleFunction = number -> number * 2;
        double result = doubleFunction.apply(38.5);

        System.out.println("result: " + result);
    }
}
