package Exercises;

public class MiniMaxArray {
    public static int miniArray(int... numbers) {
        int sum = 0;
        int[] sumArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            for (int number : numbers) {
                sum += number;
                sumArray[i] = sum -= 1;
            }

        }
        return sum;
    }
}

