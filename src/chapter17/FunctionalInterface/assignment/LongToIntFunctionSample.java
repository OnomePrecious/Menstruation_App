package chapter17.FunctionalInterface.assignment;

import java.util.function.LongToIntFunction;

public class LongToIntFunctionSample {
    public static void main(String[] args) {
        LongToIntFunction longToIntFunction = number -> (int) number;
        System.out.println(longToIntFunction.applyAsInt(89000000L));
    }
}
