package com.mfq.leetcode.code206;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/23 2:04
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution2 {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        ListNode temp = null;
        while (cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
