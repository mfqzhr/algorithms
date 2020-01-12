package com.mfq.lq.n007;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        StringBuilder builder = new StringBuilder();
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        int i;
        for (i = 0; i < n; i++) {
            if (nums[i] == num) {
                System.out.println(i + 1);
                break;
            }
        }
        if (i == n) {
            System.out.println(-1);
        }

    }
}
