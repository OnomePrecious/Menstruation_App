package chapter17.FunctionalInterface.assignment;

import java.util.function.ObjIntConsumer;

public class ObjIntConsumerSample {
    public static void main(String[] args) {
        ObjIntConsumer<Integer> objIntConsumer = (number, num) ->
                System.out.println(number + " " + num);
        objIntConsumer.accept(10, 20);
    }
}
