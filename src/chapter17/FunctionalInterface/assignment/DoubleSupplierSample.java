package chapter17.FunctionalInterface.assignment;

import java.util.Random;
import java.util.function.DoubleSupplier;

public class DoubleSupplierSample {
    public static void main(String[] args) {
        DoubleSupplier doubleSupplier = () -> new Random().nextDouble();
        System.out.println("Result: " +  doubleSupplier.getAsDouble());



        }
    }

