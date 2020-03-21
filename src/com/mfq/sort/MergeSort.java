package com.mfq.sort;

import java.util.Arrays;

public class MergeSort {
    private int[] temp;

    public void mergeSort(int[] arr, int lo, int hi) {
        temp = new int[arr.length];
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
        for (int i = lo; i <= hi; i++) {
            temp[i] = arr[i];
        }
        int i = lo, j = mid + 1, k = lo;
        while (i <= mid && j <= hi) {
            arr[k++] = temp[i] <= temp[j] ? temp[i++] : temp[j++];
        }
        while (i <= mid) {
            arr[k++] = temp[i++];
        }
        while (j <= hi) {
            arr[k++] = temp[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 6, 6, 8, 1, 34, 112, 1, 435, 23434};
        new MergeSort().mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
