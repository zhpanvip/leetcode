package com.zhangpan.leetcode.link;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0开头。
 *
 *
 * 示例 1：
 *
 *
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 * 示例 2：
 *
 * 输入：l1 = [0], l2 = [0]
 * 输出：[0]
 * 示例 3：
 *
 * 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * 输出：[8,9,9,9,0,0,0,1]
 *
 * 提示：
 *
 * 每个链表中的节点数在范围 [1, 100] 内
 * 0 <= Node.val <= 9
 * 题目数据保证列表表示的数字不含前导零
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
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
