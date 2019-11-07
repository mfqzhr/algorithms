package com.mfq.stack;

import com.mfq.array.Array;

public class ArrayStack<T> implements Stack<T> {
    Array<T> array;

    public ArrayStack(int capacity) {
        array = new Array<>(capacity);

    }

    public ArrayStack() {
        array = new Array<>();
    }

    @Override
    public void push(T e) {
        array.addLast(e);

    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public T pop() {
        return array.delete(array.getSize() - 1);

    }

    @Override
    public T peek() {
        return array.getLast();
    }

    public int getCapacity() {
        return array.getCapacity();
    }


    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack: ");
        res.append("[");
        for (int i = 0; i < array.getSize(); i++) {
            res.append(array.get(i));
            if (i != array.getSize() - 1) {
                res.append(", ");
            }
        }
        res.append("] top");
        return res.toString();
    }
}
