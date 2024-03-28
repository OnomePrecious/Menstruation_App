package Exercises;

import java.util.Arrays;

public class DemoSubtract {
    public static int[] maximumNumber(int[] numbers) {
        int[] numberToReturn = new int[1];
        int largest = numbers[0];
        int smallest = numbers[0];
        for (int number : numbers) {
            if (number > largest) largest = number;
            if (number < smallest) smallest = number;
        }
        numberToReturn[0] = largest - smallest;
        return numberToReturn;
    }


    public static void main(String[] args) {
        int[] numbers = {2, 4, 5, 7, 8};
        System.out.println(Arrays.toString(DemoSubtract.maximumNumber(numbers)));
    }
}
