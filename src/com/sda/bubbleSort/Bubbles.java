package com.sda.bubbleSort;

import java.util.Arrays;
import java.util.Random;

public class Bubbles {

    static int arraySize  = 20;
    public static void main(String[] args) {

        int[] arr = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i<arr.length; i++)
            arr[i] = random.nextInt(26) -5;
        int[] sortedArr = sort(arr);


    }
    private static int[] sort(int[] arr) {
        boolean isSorted = true;
        while (isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                    isSorted = false;

                }
            }
        }
        return arr;
    }


}
