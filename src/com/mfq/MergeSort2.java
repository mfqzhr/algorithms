package com.mfq;

/**
 * @author 穆繁强
 * @date 2019/10/26
 */
public class MergeSort2 {

    public static void main(String[] args) {
        int[] arr = new int[]{2,4,1};
        mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void mergeSort(int[] arr) {
        mySort(arr, 0, arr.length - 1);
    }

    private static void mySort(int[] arr, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) >> 1;
        mySort(arr, lo, mid);
        mySort(arr, mid + 1, hi);
        myMerge(arr, lo, mid, hi);
    }

    private static void myMerge(int[] arr, int lo, int mid, int hi) {
        int[] cp = new int[arr.length];
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi ; k++) {
            cp[k] = arr[k];
        }

        for (int k = 0; k <= hi ; k++) {
            if (i > mid) {
                arr[k] = cp[j++];
            } else if (j > hi) {
                arr[k] = cp[i++];
            } else if (arr[j] < arr[i]) {
                arr[k] = cp[j++];
            } else {
                arr[k] = cp[i++];
            }
        }

    }
}
