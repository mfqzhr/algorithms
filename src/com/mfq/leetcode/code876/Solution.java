package com.mfq.leetcode.code876;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/23 11:40
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
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode low = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            low = low.next;
        }
        return low;
    }
}
