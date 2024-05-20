package chapter17.FunctionalInterface.assignment;

import java.util.function.ObjDoubleConsumer;

public class ObjDoubleConsumerSample {
    public static void main(String[] args) {
        ObjDoubleConsumer<String> objDoubleConsumer = (word, number) ->
                System.out.println( word + " " + number);
        objDoubleConsumer.accept("I miss you", 505);
   }
}
