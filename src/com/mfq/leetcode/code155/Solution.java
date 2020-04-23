package com.mfq.leetcode.code155;


import java.util.Stack;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/23 11:50
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {


}


class MinStack {
    Stack<Integer> dataStack;
    Stack<Integer> minStack;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        if (minStack.isEmpty()) {
            minStack.push(x);
        } else if (x < getMin()) {
            minStack.push(x);
        } else {
            minStack.push(getMin());
        }
        dataStack.push(x);
    }

    public void pop() {
        dataStack.pop();
        minStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
