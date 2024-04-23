package Exercises;

import java.util.Arrays;

public class SortArray {
    public static int[] greaterProduct(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] == 0) {
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
          return  numbers;
        }


    public static void main(String[] args) {
        int[] numbers = { 0, 0, 8, 9, 2};
        System.out.println(Arrays.toString(greaterProduct(numbers)));
    }
}

