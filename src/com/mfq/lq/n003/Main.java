package com.mfq.lq.n003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 10000; i < 1000000; i++) {
            String s1 = String.valueOf(i);
            StringBuilder builder = new StringBuilder();
            if (builder.append(s1).reverse().toString().equals(s1)) {
                char[] chars = s1.toCharArray();
                int num = 0;
                for (int j = 0; j < chars.length; j++) {
                    num += (chars[j] -'0');
                }
                if (n == num) {
                    System.out.println(s1);
                }
            }
        }

    }
}
