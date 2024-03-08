package Exercises;

import java.util.Scanner;
public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer:");
        int number = scanner.nextInt();

        int square = number * number;
System.out.println("The square of the number is: " + square);

        if(square > 100) {
            System.out.println("The number and its square " +  square  + " is greater than 100");
        }
        if(square == 100) {
            System.out.println("The number and its square " +  square +  " is equal to 100");
        }

        if(square != 100) {
            System.out.println("The number and its square " + square +  " is not equal to 100");
        }
        if(square < 100) {
            System.out.println("The number and its square "  +  square  +  " is less than 100");

        }
    }
}
