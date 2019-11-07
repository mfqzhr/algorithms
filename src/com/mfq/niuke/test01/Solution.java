package com.mfq.niuke.test01;

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个
 * 整数，判断数组中是否含有该整数。
 */
public class Solution {
    public boolean Find(int target, int[][] array) {

        for (int i = 0; i < array.length; i++) {

            int res = binarySearch(target, array[i], 0, array[0].length - 1);
            if (res != -1) {
                return true;
            }

        }


        return false;
    }

    private int binarySearch(int key, int[] array, int lo, int hi) {

        if (lo > hi) {
            return -1;
        }
        int mid = lo + ((hi - lo) >> 1);
        if (key == array[mid]) {
            return mid;
        } else if (key > array[mid]) {
            return binarySearch(key, array, mid + 1, hi);
        } else if (key < array[mid]) {
            return binarySearch(key, array, lo, mid - 1);
        } else return -1;
    }

    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = i * 10 + j;
            }

        }
        for (int i = 0; i < 100; i++) {
            System.out.println(new Solution().Find(i, arr));
        }

    }
}
