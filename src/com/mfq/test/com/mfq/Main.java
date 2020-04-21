package com.mfq.test.com.mfq;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/20 16:32
 * @description：
 * @modified By：
 * @version: $
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().getNumber(4, 5, 3, 3));
    }

    int res = 0;

    public int getNumber(int n, int m, int a, int b) {
        int[][] arr = new int[n][m];
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                /*if (i >= (a - 1) && j >= (b - 1))
                    arr[i][j] = k;
                k++;*/
                arr[i][j] = k;
                k++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        help(arr, a - 1, b - 1);
        System.out.println(res);
        return res;
    }

    private void help(int[][] arr, int i, int j) {
        if (i > arr.length - 1 || j > arr[0].length - 1 || arr[i][j] == 0) {
            return;
        }
        res += arr[i][j];
        arr[i][j] = 0;
        help(arr, i + 1, j);
        help(arr, i, j + 1);
    }


}
