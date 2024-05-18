package chapter17.FunctionalInterface.assignment;

import java.util.function.IntFunction;

public class IntFunctionSample {
    public static void main(String[] args) {
        IntFunction<Integer> number = (value) -> value + value;
        int result = 65;
        System.out.println(number.apply(result));
    }
}
