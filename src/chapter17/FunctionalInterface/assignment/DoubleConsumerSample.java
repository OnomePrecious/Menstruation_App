package chapter17.FunctionalInterface.assignment;

import java.util.function.DoubleConsumer;

public class DoubleConsumerSample {
    public static void main(String[] args) {
        DoubleConsumer doubleConsumer = (firstNumber) -> {
        double result = firstNumber + firstNumber;
            System.out.println("Result: " + result);
        };
        doubleConsumer.accept(10.0);
    }
}

