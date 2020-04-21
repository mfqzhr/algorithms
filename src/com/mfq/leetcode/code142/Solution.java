package com.mfq.leetcode.code142;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/20 17:27
 * @description：
 * @modified By：
 * @version: $
 */
class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode i = head;
        ListNode j = head;
        int count = 0;
        while (head != null) {
           i = i.next;
           j = j.next.next;

        }
        return head;
    }
}
