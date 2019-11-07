package com.mfq.niuke.test02;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 *
 * 批注: 原谅我个智障忘了斐波拉契序列:
 * 指的是这样一个数列：1、1、2、3、5、8、13、21、34、……在数学上，
 * 斐波纳契数列以如下被以递推的方法定义：F(1)=1，F(2)=1, F(n)=F(n-1)+F(n-2)（n>=3，n∈N*）
 * 递归: recursion
 *
 * 思路: 使用递归实现
 */
public class Solution {

    public int Fibonacci(int n) {

        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return Fibonacci(n - 1) + Fibonacci(n - 2);

    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(new Solution().Fibonacci(i));
        }

    }


}
