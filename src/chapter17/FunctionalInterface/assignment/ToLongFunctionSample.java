package chapter17.FunctionalInterface.assignment;

import java.util.function.ToLongFunction;

public class ToLongFunctionSample {
    public static void main(String[] args) {
        ToLongFunction<String> toLongFunction = String::length;
        long result = toLongFunction.applyAsLong("Hello Mavericks!");
        System.out.println("Result:" + result);
    }
}
