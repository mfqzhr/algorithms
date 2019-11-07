package com.mfq.queue;

import javax.management.Query;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    //测试使用运行dequeue和enqueue操作所需的时间,单位:秒
    private static double testQueue(Queue<Integer> queue, int opCount) {
        long startTime = System.nanoTime();
        //
        Random random = new Random();
        for (int i = 0; i < opCount; i++) {
            queue.enqueue(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < opCount; i++) {
            queue.dequeue();
        }
        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;

    }

    public static void main(String[] args) {
        int opCount = 1000000;
        ArrayQueue<Integer> arrayQueue = new ArrayQueue(opCount);
        double time1 = testQueue(arrayQueue, opCount);
        System.out.println("Array Queue: " + time1);
        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        double time2 = testQueue(loopQueue, opCount);
        System.out.println("Loop Queue: " + time2);

    }
}
