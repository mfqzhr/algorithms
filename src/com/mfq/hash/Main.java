package com.mfq.hash;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(12, "jack", 12f);
        Person p2 = new Person(12, "jack", 12f);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
    }
}
