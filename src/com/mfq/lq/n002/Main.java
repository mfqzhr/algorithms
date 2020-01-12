package com.mfq.lq.n002;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        String s = new BigInteger(num, 10).toString(16);
        System.out.println(s.toUpperCase());
    }
}
