package chapter17.FunctionalInterface.assignment;

import java.util.function.LongConsumer;

public class LongConsumerSample {
    public static void main(String[] args) {
        LongConsumer longConsumer = (number) ->
                System.out.println("Result: " + number);
        longConsumer.accept(2000000L);
    }
}
