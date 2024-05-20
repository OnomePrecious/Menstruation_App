package chapter17.FunctionalInterface.assignment;

import java.util.function.LongFunction;

public class LongFunctionSample {
    public static void main(String[] args) {
        LongFunction<Long> number = (value) -> value * value;
        long result = 40;
        System.out.println(number.apply(result));
    }
}
