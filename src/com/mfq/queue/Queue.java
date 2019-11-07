package com.mfq.queue;

public interface Queue<T> {
    void enqueue(T e);
    T dequeue();
    T getFront();
    int getSize();
    boolean isEmpty();
}
