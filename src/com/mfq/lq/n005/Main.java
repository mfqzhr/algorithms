package com.mfq.lq.n005;

public class Main {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            char[] chars = Integer.toString(i).toCharArray();
            int n1 = chars[0] - '0';
            int n2 = chars[1] - '0';
            int n3 = chars[2] - '0';
            int res = (int) (Math.pow(n1, 3) + Math.pow(n2, 3) + Math.pow(n3, 3));
            if (res == i) {
                System.out.println(i);
            }
        }
    }
}
