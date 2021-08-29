package com.zhangpan.leetcode.list.link;

/**
 * 19. 删除链表的倒数第 N 个结点
 * <p>
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * 进阶：你能尝试使用一趟扫描实现吗？
 * <p>
 * https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 */
public class LeetCode019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }
        ListNode p1 = head;
        ListNode p2 = p1;
        for (int i = 0; i < n; i++) {
            p2 = p2.next;
        }
        // p2为null说明n与链表长度等长，因此需要移除第一个元素，故直接返回p1.next即可。
        if (p2 == null) {
            return p1.next;
        }
        while (p2.next != null) {
            p2 = p2.next;
            p1 = p1.next;
        }
        p1.next = p1.next.next;
        return head;
    }
}
