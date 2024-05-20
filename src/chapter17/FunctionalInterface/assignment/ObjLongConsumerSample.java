package chapter17.FunctionalInterface.assignment;

import java.util.function.ObjLongConsumer;

public class ObjLongConsumerSample {
    public static void main(String[] args) {
        ObjLongConsumer<String> objLongConsumer = (name, longNumber)->
                System.out.println(name + " " + longNumber);
        objLongConsumer.accept("Precious scored", 100);
    }
}
