package com.zhangpan.leetcode;

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
public class LeetCode206ReverseList {

    public static void main(String[] args) {
    }

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

//    public static ListNode reverseList(ListNode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//        ListNode cur = head;
//        ListNode next = cur.next;
//        ListNode temp;
//        while (next != null) {
//            temp = next.next;
//            next.next = cur;
//            cur = next;
//            next = temp;
//        }
//        head.next = null;
//        head = cur;
//        return head;
//    }
}
