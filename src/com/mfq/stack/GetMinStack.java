package com.mfq.stack;

import java.util.Random;
import java.util.Stack;

/**
 * 查找栈中的最小的元素
 */
public class GetMinStack {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public GetMinStack() {
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }

    public void push(int data) {
        stackData.push(data);
        if (stackMin.isEmpty()) {
            stackMin.push(data);
            stackData.push(data);
        } else {
            if (stackMin.peek() > data) {
                stackMin.push(data);
            }
        }

    }

    public int pop() {
        int data = stackData.pop();
        if (data == stackMin.peek()) {
            stackMin.pop();
        }
        return data;

    }

    public int getMin() {
        return stackMin.pop();
    }


    public static void main(String[] args) {
        GetMinStack getMinStack = new GetMinStack();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int data = (int) (random.nextDouble() * 10);
            getMinStack.push(data);
            System.out.print(data + " ");

        }
        System.out.println();
        System.out.println(getMinStack.getMin());

    }
}
