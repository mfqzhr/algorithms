package com.mfq.lq.n006;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == i) {
                    arr[i][j] = 1;
                    System.out.println(arr[i][j]);
                } else if (j == 0) {
                    arr[i][j] = 1;
                    System.out.print(arr[i][j] + " ");
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
