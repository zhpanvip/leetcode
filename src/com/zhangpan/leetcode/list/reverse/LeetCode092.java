package com.zhangpan.leetcode.list.reverse;

import com.zhangpan.leetcode.list.link.ListNode;

/**
 * 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
 * <p>
 * 说明:
 * 1 ≤m≤n≤ 链表长度。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL, m = 2, n = 4
 * 输出: 1->4->3->2->5->NULL
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-linked-list-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode092 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null) {
            return head;
        }
        return reverse(head, left, right);
    }

    private ListNode reverse(ListNode head, int left, int right) {
        if (left == 1) {
            return LeetCode92$.reverseLink(head, right);
        }
        head.next = reverse(head.next, left - 1, right - 1);
        return head;
    }
}
