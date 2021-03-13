package com.zhangpan.leetcode.list.reverse;

import com.zhangpan.leetcode.list.link.ListNode;

/**
 * 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode206 {

    public static void main(String[] args) {
    }

    /**
     * 迭代法法
     */
    public static ListNode reverseLink(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = head;
        ListNode next = cur.next;
        ListNode temp;
        while (next != null) {
            temp = next.next;
            next.next = cur;
            cur = next;
            next = temp;
        }
        head.next = null;
        return cur;
    }

    /**
     * 递归法
     * 递归的递流程直接找到递归的最后一个节点，最后一个节点的next为null,返回自身，然后开始递归的归流程
     * 递归的归流程，从最后一个节点向上回溯，将最后一个节点的next指向倒数第二个节点，倒数第二个节点的next指向null
     * 以此回溯到第一个节点完成链表的反转
     */
    public static ListNode reverseLink2(ListNode head) {
        // head == null这个条件一定要判断啊！！！！
        if (head == null || head.next == null) {
            return head;
        }
        // 返回最后一个节点
        ListNode lastNode = reverseLink2(head.next);
        head.next.next = head;
        head.next = null;
        return lastNode;
    }
}
