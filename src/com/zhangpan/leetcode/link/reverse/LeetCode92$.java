package com.zhangpan.leetcode.link.reverse;


import com.zhangpan.leetcode.link.ListNode;

/**
 * 反转链表前 N 个节点
 * LeetCode第206题的扩展
 */
public class LeetCode92$ {

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
