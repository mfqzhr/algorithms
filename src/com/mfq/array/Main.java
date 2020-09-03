package com.mfq.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n * n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        Arrays.sort(arr, Collections.reverseOrder());
        int[][] arrs = new int[n][n];
        help(arrs, 0, 0, 0, arr);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(arrs[i][j]);
            }
            System.out.println(arrs[i][n - 1]);
        }
    }

    private static void help(int[][] arrs, int i, int j, int k, Integer[] arr) {
        if (i < 0 || i > (arrs[0].length - 1) || j < 0 || j > (arrs[0].length - 1)) {
            return;
        }
        if (arrs[i][j] != 0) {
            return;
        }
        arrs[i][j] = arr[k];
        if (!(i == arrs[0].length - 2 && j == 0))
            help(arrs, i, j + 1, k + 1, arr);
        help(arrs, i + 1, j, k + 1, arr);
        help(arrs, i, j - 1, k + 1, arr);
        help(arrs, i - 1, j, k + 1, arr);
    }
}