package Exercises;

import java.util.Arrays;

public class AddingLastIndex {
    public static int[] addIndex(int...numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length; j++){
                int temp = numbers[j];
                for (int index = numbers[j] = numbers[i]; index > 0; index--) {
                    
                }
                numbers[i] = temp;

            }

        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] userInput = {5, 2, 3, 1, 2};
        System.out.println(Arrays.toString(AddingLastIndex.addIndex(userInput)));
    }
}
