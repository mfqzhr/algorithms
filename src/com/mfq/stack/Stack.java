package com.mfq.stack;

public interface Stack<T> {
    void push(T e);
    int getSize();
    T pop();
    T peek();
    boolean isEmpty();




}
