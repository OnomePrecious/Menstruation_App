package chapter17.FunctionalInterface.assignment;

import java.util.function.ToDoubleFunction;

public class ToDoubleFunctionSample {
    public static void main(String[] args) {
        ToDoubleFunction<Integer> toDoubleFunction = (number)->
                Integer.valueOf(number).doubleValue();

        double result = toDoubleFunction.applyAsDouble(657010);

        System.out.println("Result: " + result);

    }
}
