package Exercises;

public class MinMax {
    public static int maxNumber(int...numbers) {
        int largest = 0;
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }
        return largest;
    }

        public static int miniNumber(int...numbers){
                int smallest = 0;
            for(int number : numbers) {
                if(number < smallest){
                    smallest = number;
                }
            }
            return smallest;

        }
}
