package com.zhangpan.leetcode.list.reverse;


import com.zhangpan.leetcode.list.ListNode;

/**
 * 反转链表前 N 个节点
 * LeetCode第206题的扩展
 */
public class LeetCode206$ {

    public static ListNode cursor;

    public static ListNode reverseLink(ListNode head, int n) {
        if (n == 1) {
            cursor = head.next;
            return head;
        }
        ListNode lastNode = reverseLink(head.next, n - 1);
        head.next.next = head;
        head.next = cursor;
        return lastNode;
    }
}
