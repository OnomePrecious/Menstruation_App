package fireDrillTwo;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int average = 0;
        int sum = 0;
        while (count < 10) {
            System.out.println("Enter score " + (count + 1) +  ":");
            int score = input.nextInt();
            count++;
            sum += score;

            average = sum/ count;
        }
        System.out.println("The Sum is:" + sum);
        System.out.println("The Average is:" + average);

    }
}



