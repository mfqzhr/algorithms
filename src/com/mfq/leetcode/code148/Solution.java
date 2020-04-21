package com.mfq.leetcode.code148;

import sun.awt.image.IntegerComponentRaster;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/20 15:09
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
    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        Collections.sort(list);
        ListNode res = new ListNode(-1);
        ListNode ans = res;
        for (int i = 0; i < list.size(); i++) {
            res.next = new ListNode(list.get(i));
            res = res.next;
        }

        return ans.next;
    }

}
