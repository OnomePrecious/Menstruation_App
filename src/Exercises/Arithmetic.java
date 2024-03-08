package Exercises;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two integers:");
        int firstNumber = scanner.nextInt();

        int secondNumber = scanner.nextInt();

        int square1 = firstNumber * firstNumber;

        int square2 = secondNumber * secondNumber;

        int sum = square1 + square2;

        int difference = square1 - square2;

        System.out.println("The square of the first number is: " + square1);
        System.out.println("The square of the second number is: " + square2);
        System.out.println("The sum of the square is: " + sum);
        System.out.println("The difference between first number squared and the second number is: " + difference);


    }
}
