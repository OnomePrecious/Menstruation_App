package chapter17.FunctionalInterface.assignment;

import java.util.function.IntConsumer;

public class IntConsumerSample {
    public static void main(String[] args) {
        IntConsumer intConsumer = number -> System.out.println("Result:" + number);
            int number = 76;
            intConsumer.accept(number);

        }
    }
