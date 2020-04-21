package com.mfq;

import java.util.Arrays;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/19 9:12
 * @description：
 * @modified By：
 * @version: $
 */
public class MergeSort3 {

    public static void mergeSort(int[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int mid = lo + ((hi - lo) >> 1);
        mergeSort(arr, lo, mid);
        mergeSort(arr, mid + 1, hi);
        merge(arr, lo, mid, hi);
    }

    private static void merge(int[] arr, int lo, int mid, int hi) {
        int[] arr0 = new int[arr.length];
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            arr0[k] = arr[k];
        }
        int k = lo;
        while (i <= mid && j <= hi) {
            arr[k++] = arr0[i] <= arr0[j] ? arr0[i++] : arr0[j++];
        }
        while (i <= mid) {
            arr[k++] = arr0[i++];
        }
        while (j <= hi) {
            arr[k++] = arr0[j++];
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 2, 3, 5, 1, 7, 123, 34};
        mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
