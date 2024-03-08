package ArrayExercises;

public class InitArray {
    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 3, 4, 5, 6}};
        int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};
        System.out.println("Values in array1 by row are: ");
        outputArray(array1);
        System.out.printf("%nValues in array2 by row are%n");
        outputArray(array2);
    }
    public static void outputArray(int[][]array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.printf("%d  ", anInt);
            }
            System.out.println();
        }

    }
}
