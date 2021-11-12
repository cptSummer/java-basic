package com.HT;

import java.util.Arrays;

public class MergeSort {
    public int[] sort(int[] array) {
        if (array.length > 1) {
            int[] left = sort(Arrays.copyOfRange(array, 0, array.length / 2));
            int[] right = sort(Arrays.copyOfRange(array, array.length / 2, array.length));

            return merege(left, right);
        }
        return array;
    }

    private int[] merege(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int i = 0;
        int iL = 0;
        int iR = 0;

        while (iL < left.length || iR < right.length) {
            int element;
            if (iL == left.length) {
                element = right[iR++];
            } else if (iR == right.length || iL < left.length && left[iL] < right[iR] ) {
                element = left[iL++];
            }
            else {
                element = right[iR++];
            }
            result[i] = element;
            i++;
        }
        return result;
    }
}
//else if (iL < left.length && left[iL] < right[iR]) element = left[iL++];