package com.mfq.leetcode.code24;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int x) {
        this.val = x;
    }
}

class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}
