package chapter17.streams;

import java.util.List;


public class Example3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 25, 30, 40, 50);
        numbers.stream()
        .filter((number) -> number%2!=0) //there must be at least one terminal operation in your code e.g forEach()
        .forEach(System.out::println);  // ::->(shorthand notation also known as method reference).forEach((number) -> System.out.println(number+" "));// you won't need method reference cos of the concatenation.

    }
}

