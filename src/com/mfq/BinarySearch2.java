package com.mfq;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/18 10:32
 * @description：二分查找
 * @modified By：
 * @version: $
 */
public class BinarySearch2 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 5, 7, 8, 12};
        System.out.println(binarySearch0(0, arr.length - 1, 5, arr));

    }

    public static int binarySearch(int lo, int hi, int key, int[] arr) {
        int l = lo, r = hi;
        while (l <= r) {
            int mid = (lo + hi) / 2;
            if (arr[mid] < key) {
                hi = hi - 1;
            } else if (arr[mid] > key) {
                lo = lo + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int binarySearch0(int lo, int hi, int key, int[] arr) {
        if (lo > hi) {
            return -1;
        }
        int mid = lo + ((hi - lo) >> 2);
        if (arr[mid] < key) {
            return binarySearch0(lo + 1, hi, key, arr);
        } else if (arr[mid] > key) {
            return binarySearch0(lo, hi - 1, key, arr);
        } else {
            return mid;
        }
    }
}
