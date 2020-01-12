package com.mfq.lq.n001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n > 0) {
            String numHex = scanner.next();
            char[] nums = numHex.toCharArray();
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < numHex.length(); i++) {
                String s = Integer.toBinaryString(Integer.parseInt(String.valueOf(nums[i]), 16));
                s = "0000" + s;
                s = s.substring(s.length() - 4);
                builder.append(s);
            }
            nums = builder.toString().toCharArray();
            builder = new StringBuilder();
            for (int i = 0; i < nums.length - 3; i = i + 3) {
                String value = String.valueOf(nums, nums.length - i - 3, 3);
                value = Integer.toOctalString(Integer.parseInt(value, 2));
                builder.append(value);
            }
            System.out.println(builder.reverse());
            n--;
        }


    }
}
