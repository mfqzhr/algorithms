package com.mfq.sort;

import java.util.Arrays;

public class QuickSort {
    public void qSort(int[] arr, int lo, int hi) {
        if (lo >= hi || arr.length <= 1 || arr == null) {
            return;
        }
        int i = lo, j = hi, p = arr[(lo + hi) / 2];
        while (i <= j) {
            while (arr[i] < p) {
                ++i;
            }
            while (arr[j] > p) {
                --j;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                ++i;
                --j;
            } else if (i == j) {
                ++i;
            }
        }

        qSort(arr, lo, j);
        qSort(arr, i, hi);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 6, 6, 8, 1, 34, 112, 1, 435, 23434};
        new QuickSort().qSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
