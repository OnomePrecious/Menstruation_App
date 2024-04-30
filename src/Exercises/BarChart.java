package Exercises;

import java.util.Scanner;

public class BarChart {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter five numbers between 1 and 30 : ");
        int numbers = scanner.nextInt();

        if (numbers > 30) {
            System.out.println("Numbers must be between 1 and 30 : ");
        } else {
            for (int stars = 0; stars < numbers; stars++) {
                System.out.print("*");
            }
        }
    }
}

