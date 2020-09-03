package com.mfq.leetcode.cdoe547;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/9/1 13:52
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution2 {
    public int findCircleNum(int[][] M) {
        UnionFind unionFind = new UnionFind(M);
        for (int i = 0; i < M.length; i++) {
            for (int j = i; j < M.length; j++) {
                if (M[i][j] == 1) {
                    unionFind.union(i, j);
                }

            }
        }
        return unionFind.sizeMap.keySet().size();
    }
}



class UnionFind {
    public Map<Integer, Integer> parents = new HashMap<>();
    public Map<Integer, Integer> sizeMap = new HashMap<>();

    public UnionFind(int[][] M) {
        for (int i = 0; i < M.length; i++) {

            parents.put(i, i);
            sizeMap.put(i, 1);
        }
    }

    public Integer findFather(Integer cur) {
        Stack<Integer> stack = new Stack<>();
        while (cur != parents.get(cur)) {
            stack.push(cur);
            cur = parents.get(cur);
        }
        while (!stack.isEmpty()) {
            parents.put(stack.pop(), cur);
        }
        return cur;
    }

    public void union(Integer a, Integer b) {
        Integer aHead = findFather(a);
        Integer bHead = findFather(b);
        if (aHead != bHead) {// 如果 M.length >= 1000 请使用 equals方法
            int aSize = sizeMap.get(aHead);
            int bSize = sizeMap.get(bHead);
            if (aSize >= bSize) {
                parents.put(bHead, aHead);
                sizeMap.put(aHead, aSize + bSize);
                sizeMap.remove(bHead);
            } else {
                parents.put(aHead, bHead);
                sizeMap.put(bHead, aSize + bSize);
                sizeMap.remove(aHead);
            }
        }
    }

    public static void main(String[] args) {
        int M[][] = new int[][]{
                {1,1,0},
                {1,1,1},
                {0,1,1}
        };
        System.out.println(new Solution2().findCircleNum(M));
    }
}
