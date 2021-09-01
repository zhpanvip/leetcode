package com.zhangpan.leetcode.link;

/**
 * 86. 分隔链表扩展
 * 给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 x 的节点之前，大于x的节点出现在x之后。
 * 你应当 保留 两个分区中每个节点的初始相对位置。
 */
public class LeetCode086$ {


    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, null);
        ListNode l2 = new ListNode(5, l1);
        ListNode l3 = new ListNode(2, l2);
        ListNode l4 = new ListNode(3, l2);
        ListNode l5 = new ListNode(4, l4);
        ListNode l6 = new ListNode(1, l5);
        partition(l6,3);
    }

    public static ListNode partition(ListNode head, int x) {
        // 小于x的链表头
        ListNode preHead = new ListNode();
        // 等于x的链表头
        ListNode midPreHead = new ListNode();
        // 大于x的链表头
        ListNode lastPreHead = new ListNode();
        // 分别表示三个链表的链表尾
        ListNode headTail = preHead, midTail = midPreHead, lastTail = lastPreHead;

        while (head != null) {
            if (head.val < x) {
                headTail.next = head;
                headTail = headTail.next;
            } else if (head.val == x) {
                midTail.next = head;
                midTail = midTail.next;
            } else {
                lastTail.next = head;
                lastTail = lastTail.next;
            }
            ListNode next = head.next;
            head.next = null;
            head = next;
        }

        if (preHead.next != null) { // 小于x的链表有数据
            if (midPreHead.next != null) {
                headTail.next = midPreHead.next;
                midTail.next = lastPreHead.next;
            } else {
                headTail.next = lastPreHead.next;
            }
            return preHead.next;
        } else {
            if (midPreHead.next != null) {
                midTail.next = lastPreHead.next;
                return midPreHead.next;
            } else {
                return lastPreHead.next;
            }
        }
    }
}
