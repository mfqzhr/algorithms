package com.mfq.array;

public class Main {
    public static void main(String[] args) {
        Array<String> array = new Array();
        for (int i = 0; i < 10; i++) {
            array.addLast(i + "");

        }
        array.add(1, "29");
        System.out.println(array);
        array.delete(3);
        System.out.println(array);
        array.delete(3);
        System.out.println(array);
    }
}
