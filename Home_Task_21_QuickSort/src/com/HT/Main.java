package com.HT;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 14);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] meregeSort = new MergeSort().sort(arr);
        System.out.println("Merege Sort");
        System.out.println(Arrays.toString(meregeSort));
        System.out.println("Quick Sort");
        int[] quickSort = new QuickSort().sort(arr);
        System.out.println(Arrays.toString(quickSort));

    }
}
