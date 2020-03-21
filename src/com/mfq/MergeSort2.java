package com.mfq;


import com.mfq.array.Array;
import com.mfq.leetcode.code151.Solution;

import java.util.Arrays;

/**
 * @author 穆繁强
 * @date 2019/10/26
 */
public class MergeSort2 {
    private int[] auk;

    public void mergeSort(int arr[], int lo, int hi) {
        auk = new int[arr.length];
        mergeSort0(arr, lo, hi);
    }

    private void mergeSort0(int[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        mergeSort0(arr, lo, mid);
        mergeSort0(arr, mid + 1, hi);
        merge(arr, lo, mid, hi);
    }

    private void merge(int[] arr, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            auk[k] = arr[k];
        }
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                arr[k] = auk[j++];
            } else if (j > hi) {
                arr[k] = auk[i++];
            } else if (auk[i] > auk[j]) {
                arr[k] = auk[j++];
            } else {
                arr[k] = auk[i++];
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 2, 3, 5, 1, 7, 123, 1, 34};
        new MergeSort2().mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
