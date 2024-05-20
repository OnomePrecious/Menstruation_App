package chapter17.FunctionalInterface.assignment;

import java.util.function.ObjDoubleConsumer;

public class ObjDoubleConsumerSample {
    public static void main(String[] args) {
        ObjDoubleConsumer objDoubleConsumer = (obj, number) ->
                System.out.println(obj + " " + number);
        objDoubleConsumer.accept("I miss you", 505);
    }
}
