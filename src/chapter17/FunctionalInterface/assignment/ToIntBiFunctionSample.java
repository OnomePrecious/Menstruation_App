package chapter17.FunctionalInterface.assignment;

import java.util.function.ToIntBiFunction;

public class ToIntBiFunctionSample {
    public static void main(String[] args) {
        ToIntBiFunction<Double, Double> toIntBiFunction = (number, num ) -> Double.valueOf(number * 2).intValue();
        int number = toIntBiFunction.applyAsInt(45.5, 22.7);
        System.out.println("Result: " + number);
    }
}
