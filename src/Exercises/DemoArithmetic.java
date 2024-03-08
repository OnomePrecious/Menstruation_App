package Exercises;

import java.util.Scanner;
public class DemoArithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        int sum = number1 + number2 + number3;
        double average = (double) sum / 3;
        int product = number1 * number2 * number3;

            int largest = number1;

        if (number2 > largest) {
             largest = number2;
        }
        if (number3 > largest) {
             largest = number3;
        }
        int smallest = number1;

        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }

        System.out.println("The sum is: " + sum);
            System.out.printf("%s: %.2f%n", "Average",average);
            System.out.println("The product is: " + product);
            System.out.println("The largest number is:" + largest);
        System.out.println("The smallest number is:" + smallest);




    }
    }

