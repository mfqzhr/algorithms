package com.mfq.面试题;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/9/2 15:51
 * @description：
 * @modified By：
 * @version: $
 */
class S{
    public synchronized void   fun1() {
        for (int i = 0; i < 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
public class Demo {
    public static void main(String[] args) {
        final S s = new S();
        final S s1 = new S();
        new Thread(new Runnable() {
            @Override
            public void run() {
                s.fun1();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                s1.fun1();
            }
        }).start();
    }
}
