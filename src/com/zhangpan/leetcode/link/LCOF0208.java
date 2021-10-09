package com.zhangpan.leetcode.link;

import java.util.HashSet;

/**
 * 给定一个链表，如果它是有环链表，实现一个算法返回环路的开头节点。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/linked-list-cycle-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LCOF0208 {
    /**
     * 使用HashSet存储Node,对比node是否在HashSet中存在
     */
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> hashSet = new HashSet<>();
        while (head != null) {
            if (hashSet.contains(head)) {
                return head;
            } else {
                hashSet.add(head);
                head = head.next;
            }
        }
        return null;
    }

    /**
     * 快慢指针，慢指针一次走一步，快指针一次走两步。
     */
    public ListNode detectCycle2(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode listNode1 = head;
        ListNode listNode2 = head;
        while (listNode1.next != null && listNode2 != null && listNode2.next != null) {
            listNode1 = listNode1.next;
            listNode2 = listNode2.next.next;
            if (listNode1 == listNode2) {
                ListNode ptr = head;
                while (ptr != listNode1) {
                    ptr = ptr.next;
                    listNode1 = listNode1.next;
                }
                return ptr;
            }
        }
        return null;
    }


}
