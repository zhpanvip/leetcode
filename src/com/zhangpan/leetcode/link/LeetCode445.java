package com.zhangpan.leetcode.link;

import java.util.Stack;

public class LeetCode445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        while (l1 != null) {
            stack1.push(l1);
            l1 = l1.next;
        }
        while (l2 != null) {
            stack2.push(l2);
            l2 = l2.next;
        }
        int n = 0;
        ListNode head = null;
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            int sum = n;
            ListNode node = null;
            if (!stack1.isEmpty()) {
                node = stack1.pop();
                sum += node.val;
            }
            if (!stack2.isEmpty()) {
                node = stack2.pop();
                sum += node.val;
            }
            node.val = sum % 10;
            node.next = head;
            head = node;
            n = sum / 10;
        }
        if (n != 0) {
            ListNode node = new ListNode(n);
            node.next = head;
            return node;
        }
        return head;
    }
}
