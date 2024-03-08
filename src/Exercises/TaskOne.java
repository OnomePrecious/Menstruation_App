package Exercises;

import java.util.Arrays;

public class TaskOne {
    public static int[] array = {4, 5, 8};


    public static int[] getArray() {

            return array ;
    }

    public static void main(String[] args) {
      System.out.println(Arrays.toString(array) + Arrays.toString(getArray()));
    }
        }
