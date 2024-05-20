package chapter17.FunctionalInterface.assignment;

import java.util.function.ToIntFunction;

public class ToIntFunctionSample {
    public static void main(String[] args) {
        ToIntFunction<Double> toIntFunction = (number) ->
                Double.valueOf(number).intValue();
        int number = toIntFunction.applyAsInt(20.88);
        System.out.println("Result: " + number);
    }
}
