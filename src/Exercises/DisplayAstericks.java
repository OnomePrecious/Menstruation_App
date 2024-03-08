package Exercises;

import java.util.ArrayList;
import java.util.Scanner;
public class DisplayAstericks{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<Integer>();

        int numbers = 0;
        while (numbers != 22) {
            System.out.println("Enter a number between 1 and 15");
            numbers = scanner.nextInt();

            if (numbers > 15) {
                System.out.println("Enter a valid number");
            }
        }
        for (int counter = 1; counter < numbers; counter++) {
            for (int stars = 0; stars < numbers; stars++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
   }






