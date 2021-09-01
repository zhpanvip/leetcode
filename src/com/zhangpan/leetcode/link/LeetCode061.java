package com.zhangpan.leetcode.link;

/**
 * 给定一个链表，旋转链表，将链表每个节点向右移动k个位置，其中k是非负数。
 * <p>
 * 示例1:
 * <p>
 * 输入: 1->2->3->4->5->NULL, k = 2
 * 输出: 4->5->1->2->3->NULL
 * 解释:
 * 向右旋转 1 步: 5->1->2->3->4->NULL
 * 向右旋转 2 步: 4->5->1->2->3->NULL
 * 示例2:
 * <p>
 * 输入: 0->1->2->NULL, k = 4
 * 输出: 2->0->1->NULL
 * 解释:
 * 向右旋转 1 步: 2->0->1->NULL
 * 向右旋转 2 步: 1->2->0->NULL
 * 向右旋转 3 步:0->1->2->NULL
 * 向右旋转 4 步:2->0->1->NULL
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rotate-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode061 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode listNode = head;
        int size = 1;
        // 遍历查找最后一个节点
        while (listNode.next != null) {
            listNode = listNode.next;
            size++;
        }
        k = k % size;
        if (k == 0) {
            // 如果移动距离为0，则直接返回head
            return head;
        }
        // 将尾结点指向头结点，构成一个链表环
        listNode.next = head;
        ListNode newHead;
        // 根据k查找断开位置
        for (int i = 0; i < size - k - 1; i++) {
            head = head.next;
        }
        // 头结点
        newHead = head.next;
        // 尾结点指向null
        head.next = null;
        return newHead;
    }

}
