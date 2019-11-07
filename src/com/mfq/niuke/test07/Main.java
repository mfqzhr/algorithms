package com.mfq.niuke.test07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 穆繁强
 * @date 2019/10/25
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars1 = scanner.nextLine().toCharArray();
        char[] chars2 = scanner.nextLine().toCharArray();
        List<Integer> list = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < chars2.length; i++) {
            switch (chars2[i]) {
                case 'i':

                    break;
                case 'f':
                    break;
                case 'x':
                    break;
                case 'h':
                    break;
                case 'l':
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + chars2[i]);
            }
        }
    }
}
