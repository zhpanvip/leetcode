package com.zhangpan.leetcode.link;

/**
 * 同LeetCode 21 题
 * 剑指 Offer 25. 合并两个排序的链表
 * <p>
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 * <p>
 * 示例1：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LCOF25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode node = new ListNode();
        ListNode head = node;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                node.next = l1.next;
                l1 = l1.next;
            } else {
                node.next = l2.next;
                l2 = l2.next;
            }
            node = node.next;
        }
        node.next = null;
        while (l1 != null) {
            node.next = l1;
            l1 = l1.next;
            node = node.next;
        }
        while (l2 != null) {
            node.next = l2;
            l2 = l2.next;
            node = node.next;
        }
        return head.next;
    }
}
