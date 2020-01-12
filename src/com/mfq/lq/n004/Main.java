package com.mfq.lq.n004;

public class Main {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            String value = String.valueOf(i);
            if (value.equals(new StringBuilder(value).reverse().toString())) {
                System.out.println(value);
            }
        }
    }
}
