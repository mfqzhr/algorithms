package com.mfq;

import java.util.Arrays;

public class MergeSort {

    private static int[] aux;

    public static void merge(int[] a, int lo, int mid, int hi) {
        //将lo-mid mid+1-hi进行归并
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        int k = lo;
        while (i <= mid && j <= hi) {
            a[k++] = aux[i] < aux[j] ? aux[i++] : aux[j++];
        }
        while (i <= mid) {
            a[k++] = aux[i++];
        }
        while (j <= hi) {
            a[k++] = aux[j++];
        }

    }

    public static void sort(int[] a) {
        aux = new int[a.length];
        sort(a, 0, a.length - 1);

    }

    private static void sort(int[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }


    public static void main(String[] args) {
        int[] a = {5, 2, 3, 5, 1, 7, 123, 34};
        MergeSort.sort(a);
        System.out.println(Arrays.toString(a));
/*        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }*/
    }

}

