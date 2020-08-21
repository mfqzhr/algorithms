package com.mfq.sort;

import java.util.Arrays;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/8/19 15:27
 * @description：
 * @modified By：
 * @version: $
 */
public class MergeSort0 {

    private static int[] temp;

    public static void sort(int[] arr) {
        temp = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1);
    }

    public static void mergeSort(int[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int mid = lo + ((hi - lo) >>> 2);
        mergeSort(arr, lo, mid);
        mergeSort(arr, mid + 1, hi);
        merge(arr, lo, mid, hi);
    }

    private static void merge(int[] arr, int lo, int mid, int hi) {
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
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
