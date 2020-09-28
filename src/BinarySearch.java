


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
*
* 二分查找的两种实现方式你好
* */
public class BinarySearch {
    /**
     * 1.使用循环
     * @param key
     * @param a
     * @return
     */
    public  static  int rank(int key,int a[]) {
        //数组必须是有序的
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            //被查找的数字要么不存在要么在lo和hi之间
            int mid = lo + (hi -lo)/2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

    /**
     * 递归实现
     * @param key
     * @param a
     * @return
     */

    public static int rankRecursion(int key,int[] a) {
        return rankRecursion(key, a, 0, a.length - 1);

    }

    public static int rankRecursion(int key, int[] a, int lo, int hi) {
        if (lo > hi)
            return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            return rankRecursion(key, a, lo, mid - 1);
        } else if (key > a[mid]) {
            return rankRecursion(key, a, mid + 1, hi);

        } else return mid;
    }


        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] whiteList = new int[N];
        for (int i = 0; i <whiteList.length ; i++) {
            whiteList[i] = sc.nextInt();
        }
        Arrays.sort(whiteList);
        while (sc.hasNext()) {
            int key = sc.nextInt();
            if (rank(key, whiteList) == -1) {
                System.out.println("没有找到" + key);
            } else {
                System.out.println(key + "的位置是" + rank(key, whiteList));
            }

        }



    }



}
