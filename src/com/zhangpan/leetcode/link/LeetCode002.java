package com.zhangpan.leetcode.link;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        ListNode node1 = l1, node2 = l2;
        while (node1 != null && node2 != null) {
            queue1.offer(node1.val);
            node1 = node1.next;
            queue2.offer(node2.val);
            node2 = node2.next;
        }

        boolean b = false;
        ListNode head = null;
        ListNode p = null;
        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            int result = queue1.poll() + queue2.poll();
            ListNode node = new ListNode((result + (b ? 1 : 0)) % 10);
            if (head == null) {
                head = node;
                p = node;
            } else {
                p.next = node;
                p = node;
            }
            b = result + (b ? 1 : 0) >= 10;
        }

        while (node1 != null) {
            ListNode node = new ListNode((node1.val + (b ? 1 : 0)) % 10);
            p.next = node;
            p = node;
            b = node1.val + (b ? 1 : 0) >= 10;
            node1 = node1.next;
        }

        while (node2 != null) {
            ListNode node = new ListNode((node2.val + (b ? 1 : 0)) % 10);
            p.next = node;
            p = node;
            b = node2.val + (b ? 1 : 0) >= 10;
            node2 = node2.next;
        }
        if (b) {
            p.next = new ListNode(1);
        }
        return head;
    }
}
