package chapter17.streams;

public class Example6 {
    public static void main(String[] args) {
        String word = "Hello";

//        IntStream intStream = word.chars();
//        intStream.forEach(System.out::println);

//        word.chars()
//                .filter((number) -> number > 100)
//                .map((number) -> number * number)
//                .forEach(System.out::println);


                Boolean result = word.chars()
                        .filter((number) -> number > 100)
                .mapToObj((number) -> Boolean.TRUE)
                .reduce(false, (a, b) -> a != b);

        System.out.println(result);

        /** the logic behind the mapToObj using Boolean.
         * false != true => true*
         * true != true => false
         * false != true => true
         * true != true => false
         */
    }
}

