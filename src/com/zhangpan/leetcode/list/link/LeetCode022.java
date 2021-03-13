package com.zhangpan.leetcode.list;

public class LeetCode022 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode listNode1 = head;
        ListNode listNode2 = head;
        for (int i = 0; i < k - 1; i++) {
            listNode1 = listNode1.next;
        }
        while (listNode1 != null && listNode1.next != null) {
            listNode1 = listNode1.next;
            listNode2 = listNode2.next;
        }
        return listNode2;
    }
}
