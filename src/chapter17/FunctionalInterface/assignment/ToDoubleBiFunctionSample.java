package chapter17.FunctionalInterface.assignment;

import java.util.function.ToDoubleBiFunction;

public class ToDoubleBiFunctionSample {
    public static void main(String[] args) {
        ToDoubleBiFunction<Integer, Integer> toDoubleBiFunction = (number,  num) ->
                Integer.valueOf(number).doubleValue() * Integer.valueOf(num).doubleValue();
        double result = toDoubleBiFunction.applyAsDouble(5, 10);
        System.out.println(result);
    }

}
