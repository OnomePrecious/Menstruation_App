package chapter17.streams;

import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        List<String> numbers = List.of("Precious", "Abigail", "Baliqis", "sertgold");
        numbers.stream()
                .map(String::length)  //.map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
