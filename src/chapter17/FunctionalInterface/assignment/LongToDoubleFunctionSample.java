package chapter17.FunctionalInterface.assignment;

import java.util.function.LongToDoubleFunction;

public class LongToDoubleFunctionSample {
    public static void main(String[] args) {
        LongToDoubleFunction longToDoubleFunction = number -> number + number;
        System.out.println(longToDoubleFunction.applyAsDouble(2000000L));
    }
}
