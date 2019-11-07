package com.mfq.niuke;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //位移运算,右移运算,number >> n
        //n表示的含义是,向右移动几位,相当于除以2的多少次方
/*        int a = 1000 >> 1;
        System.out.println(a);
        //
        int b = 1000 >>> 1;
        System.out.println(b);
        //
        int c = -1000 >> 1;
        System.out.println(c);
        //
        int d = 5 >>>1;
        System.out.println(d);
        int res = 12 ^ 0;
        System.out.println(res);*/
        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o1 - o2;
            }
        });

        for (int i = 10; i > 0 ; i--) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
