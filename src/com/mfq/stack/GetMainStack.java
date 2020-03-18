package com.mfq.stack;

import sun.font.DelegatingShape;

import java.util.Random;
import java.util.Stack;

public class GetMainStack {

    private Stack<Integer> stackData = new Stack<>();
    private Stack<Integer> stackMin = new Stack<>();

    public void push(Integer data) {
        if (stackMin.isEmpty()) {
            stackMin.push(data);
        } else if (data <= stackMin.peek()) {
            stackMin.push(data);
        }
        stackData.push(data);
    }

    public int pop() {
        if (stackData.isEmpty()) {
            throw new RuntimeException("没有数据了");
        }
        int data = stackData.pop();
        if (data == stackMin.peek()) {
            stackMin.pop();
        }
        return data;
    }

    public int getMin() {
        if (stackMin.isEmpty()) {
            throw new RuntimeException("没有数据了");
        }
        return stackMin.peek();
    }

    public static void main(String[] args) {
        GetMainStack getMainStack = new GetMainStack();
        for (int i = 0; i < 10; i++) {
            int data = new Random().nextInt(10);
            System.out.print(data + " ");
            getMainStack.push(data);
        }
        System.out.println();
        System.out.println(getMainStack.getMin());
        System.out.println(getMainStack.pop());
        System.out.println(getMainStack.getMin());
    }

}
