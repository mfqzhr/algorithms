package com.mfq.leetcode.code086;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/23 0:59
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
    public ListNode partition(ListNode head, int x) {
        ListNode p1 = new ListNode(-1);
        ListNode res = p1;
        ListNode p2 = new ListNode(-1);
        ListNode res2 = p2;
        while (head != null) {
            if (head.val < x) {
                p1.next = head;
                p1 = p1.next;
            } else {
                p2.next = head;
                p2 = p2.next;
            }
            head = head.next;
        }
        p2.next = null;
        p1.next = res2.next;
        return res.next;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(2);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(2);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        ListNode res = new Solution().partition(listNode1, 3);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}
