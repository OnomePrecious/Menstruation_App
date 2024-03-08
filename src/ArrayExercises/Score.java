package ArrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter scores: ");
            scores = new double[]{scanner.nextDouble()};
            for (double score : scores) {

                System.out.println(Arrays.toString(scores));
            }
        }
    }
}