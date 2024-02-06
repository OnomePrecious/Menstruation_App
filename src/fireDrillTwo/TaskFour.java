package fireDrillTwo;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        while (count < 10) {
            System.out.println("Enter scores " + (count + 1) + ":");
            int score = input.nextInt();
            count++;
            for (int index = 0; index < 10; index++) {
                if (index % 2 == 0) {
                    sum += score;
                }
                System.out.println("The sum is:" + sum);
            }
        }
    }
}