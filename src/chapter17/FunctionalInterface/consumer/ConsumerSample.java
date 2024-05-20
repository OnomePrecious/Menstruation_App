package chapter17.FunctionalInterface.consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        List<String> names = List.of("John", "Joe", "Johnny");
        names.forEach(consumer);
    }
}
