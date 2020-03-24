package com.mfq.leetcode.code060;

import com.mfq.list.LinkedList;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

public class Solution {

    public static Thread a;
    public static Thread b;

    public static void main(String[] args) {
        final LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.addLast(i + 1);
        }
        final ReentrantLock lock1 = new ReentrantLock();
        final ReentrantLock lock2 = new ReentrantLock();
        a = new Thread(new Runnable() {
            @Override
            public void run() {
                while (list.getSize() != 0) {
                    System.out.println("线程a: " + list.removeFirst());
                    if (lock2.isLocked()) {
                        lock2.unlock();
                    }
                    lock1.lock();
                }
            }
        });
        b = new Thread(new Runnable() {
            @Override
            public void run() {
                while (list.getSize() != 0) {
                    System.out.println("线程b: " + list.removeFirst());
                    if (lock1.isLocked()) {
                        lock1.unlock();
                    }
                    lock2.lock();

                }
            }
        });
        a.start();
        try {
            TimeUnit.MICROSECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        b.start();
    }

/*    public String getPermutation(int n, int k) {

    }*/

}
