package chapter17.FunctionalInterface.assignment;

import java.util.function.LongSupplier;

public class LongSupplierSample {
    public static void main(String[] args) {
        LongSupplier longSupplier = System::nanoTime;
        System.out.println(longSupplier.getAsLong());
    }
}
