package com.mfq.sort;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/8/19 15:18
 * @description：
 * @modified By：
 * @version: $
 */
public class Quick {

    public static void qSort(int[] arr, int lo, int hi) {
        if (lo >= hi || arr.length <= 1) {
            return;
        }
        int i = lo, j = hi, p = arr[(i + j) / 2];
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
}
