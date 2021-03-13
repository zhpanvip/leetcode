package com.zhangpan.leetcode.list.link;

import java.util.ArrayList;
import java.util.List;

public class LeetCode234 {
    /**
     * 复制链表，双指针校验
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }
        if (head.next == null) {
            return true;
        }
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int left = 0, right = list.size() - 1;
        while (left < right) {
            if (!list.get(left).equals(list.get(right))) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }

    /**
     * 将后半段链表反转，跟前半段对比
     */
    public boolean isPalindrome2(ListNode head) {
        if (head == null) {
            return false;
        }
        if (head.next == null) {
            return true;
        }

        int size = 0;
        ListNode node = head;
        while (node != null) {
            node = node.next;
            size++;
        }

        int halfStart = size % 2 == 0 ? size / 2 : size / 2 + 1;
        int i = 0;
        ListNode halfNode = head;
        while (i < halfStart) {
            halfNode = halfNode.next;
            i++;
        }
        ListNode reverseNode = reverseNode(halfNode);

        while (reverseNode != null) {
            if (head.val != reverseNode.val) {
                return false;
            }
            head = head.next;
            reverseNode = reverseNode.next;
        }
        return true;
    }

    private ListNode reverseNode(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }
        ListNode lastNode = reverseNode(node.next);
        node.next.next = node;
        node.next = null;
        return lastNode;
    }
}
