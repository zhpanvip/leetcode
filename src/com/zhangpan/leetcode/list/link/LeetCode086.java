package com.zhangpan.leetcode.list.link;

/**
 * 86. 分隔链表
 * <p>
 * 给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
 * <p>
 * 你应当 保留 两个分区中每个节点的初始相对位置。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/partition-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode086 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, null);
        ListNode l2 = new ListNode(5, l1);
        ListNode l3 = new ListNode(2, l2);
        ListNode l4 = new ListNode(3, l2);
        ListNode l5 = new ListNode(4, l4);
        ListNode l6 = new ListNode(1, l5);
        partition(l6, 3);
    }

    public static ListNode partition(ListNode head, int x) {
        // 存储小于x的节点
        ListNode startList = new ListNode();
        // 存储大于等于x的节点
        ListNode endList = new ListNode();
        // 指向preList的尾结点
        ListNode startListTail = startList;
        // 指向endList的尾结点
        ListNode endListTail = endList;
        // 遍历链表
        while (head != null) {
            // 小于x的链表放入startList链表中
            if (head.val < x) {
                startListTail.next = head;
                startListTail = startListTail.next;
            } else {
                // 大于等于x的节点放入endList中
                endListTail.next = head;
                endListTail = endListTail.next;
            }
            head = head.next;
        }
        startListTail.next = null;
        endListTail.next = null;
        if (startList.next != null) {
            startListTail.next = endList.next;
            return startList.next;
        } else {
            return endList.next;
        }
    }

    public int search(int[] nums, int target) {
        int mid;
        int left = 0, right = nums.length;
        while (left < right) {
            mid = (left + right) >> 1;
            if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
