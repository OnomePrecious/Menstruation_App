package Exercises;

public class MaximumProduct {

    public static int maxiNumberInArray(int... numbers) {
        int maximumNumber = 0;
        if(numbers.length == 2) {
            return numbers[0] * numbers[1];
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] * numbers[j] > maximumNumber) {
                    maximumNumber = numbers[i] * numbers[j];
                }
            }
        }
        return maximumNumber;
    }


}








