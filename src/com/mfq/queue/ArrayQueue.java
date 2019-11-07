package com.mfq.queue;

import com.mfq.array.Array;

public class ArrayQueue<T> implements Queue<T> {
    private Array<T> array;

    public ArrayQueue(int capacity) {
        array = new Array<>(capacity);
    }

    public ArrayQueue() {
        this(10);

    }

    @Override
    public void enqueue(T e) {
        array.addLast(e);
    }

    @Override
    public T dequeue() {
        return array.deleteFirst();
    }


    @Override
    public T getFront() {
        return array.get(0);
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Queue: ");
        res.append("front [");
        for (int i = 0; i < array.getSize(); i++) {
            res.append(array.get(i));
            if (i != array.getSize() - 1) {
                res.append(", ");
            }
            
        }
        res.append("] tail");

        return  res.toString();

    }

    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>(10);
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        System.out.println(queue);

    }
}
