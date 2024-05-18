package chapter17.streams;

import java.util.stream.IntStream;

public class Example2 {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 10)
                .filter((number) -> number %2== 0)
                .sum());

    }
}
