package com.zhangpan.leetcode.link;

import com.zhangpan.leetcode.link.ListNode;

import java.util.Stack;

/**
 * 实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
 * <p>
 * 注意：本题相对原题稍作改动
 * <p>
 * 示例：
 * <p>
 * 输入： 1->2->3->4->5 和 k = 2
 * 输出： 4
 * 说明：
 * <p>
 * 给定的 k 保证是有效的。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/kth-node-from-end-of-list-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode002 {
    /**
     * 使用栈的先进先出特性
     */
    public int kthToLast(ListNode head, int k) {
        Stack<ListNode> stackNode = new Stack<>();
        while (head != null) {
            stackNode.push(head);
            head = head.next;
        }
        for (int i = 0; i < k - 1; i++) {
            stackNode.pop();
        }
        return stackNode.pop().val;
    }

    /**
     * 遍历链表或得size,然后再找出倒数第k个元素
     */
    public int kthToLast2(ListNode head, int k) {
        int size = getListSize(head);
        for (int i = 0; i < size - k; i++) {
            head = head.next;
        }
        return head.val;
    }

    /**
     * 双指针
     */
    public int kthToLast3(ListNode head, int k) {
        ListNode listNode1 = head;
        ListNode listNode2 = head;
        for (int i = 0; i < k; i++) {
            listNode1 = listNode1.next;
        }
        while (listNode1 != null && listNode1.next != null) {
            listNode1 = listNode1.next;
            listNode2 = listNode2.next;
        }
        return listNode2.val;
    }

    private int getListSize(ListNode head) {
        int size = 0;
        while (head.next != null) {
            head = head.next;
            size++;
        }
        return ++size;
    }
}
