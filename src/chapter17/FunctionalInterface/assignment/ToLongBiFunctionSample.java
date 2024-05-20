package chapter17.FunctionalInterface.assignment;

import java.util.function.ToLongBiFunction;

public class ToLongBiFunctionSample {
    public static void main(String[] args) {
        ToLongBiFunction<String, Integer> toLongBiFunction = (word, number) -> word.length() * number;
        long result = toLongBiFunction.applyAsLong("I am", 5);
        System.out.println("Result:" + result);
    }
}
