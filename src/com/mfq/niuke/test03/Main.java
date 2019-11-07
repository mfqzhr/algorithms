package com.mfq.niuke.test03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public void sortIntegerArray(Integer[] pIntegerArray, int iSortFlag){
        if (iSortFlag == 0) {
            Arrays.sort(pIntegerArray, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1 - o2;
                }
            });
            System.out.print(pIntegerArray[0]);
            for (int i = 1; i < pIntegerArray.length; i++) {
                System.out.print(" " + pIntegerArray[i]);

            }
            System.out.println();
        }

        if (iSortFlag == 1) {
            Arrays.sort(pIntegerArray, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });
            System.out.print(pIntegerArray[0]);
            for (int i = 1; i < pIntegerArray.length; i++) {
                System.out.print(" " + pIntegerArray[i]);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num  = scanner.nextInt();
            Integer[] pIntegerArray = new Integer[num];
            for (int i = 0; i < num; i++) {
                pIntegerArray[i] = scanner.nextInt();
            }
            int tag = scanner.nextInt();

            new Main().sortIntegerArray(pIntegerArray, tag);

        }

    }
}
