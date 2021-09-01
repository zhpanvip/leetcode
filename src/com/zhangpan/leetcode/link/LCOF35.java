package com.zhangpan.leetcode.link;

/**
 * 剑指 Offer 35. 复杂链表的复制
 * <p>
 * 请实现 copyRandomList 函数，复制一个复杂链表。在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指向链表中的任意节点或者 null。
 * <p>
 * 示例 1：
 * <p>
 * 输入：head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
 * 输出：[[7,null],[13,0],[11,4],[10,2],[1,0]]
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/fu-za-lian-biao-de-fu-zhi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */


public class LCOF35 {

    public static void main(String[] args) {
        Node node1 = new Node(7);
        Node node2 = new Node(13);
        Node node3 = new Node(11);
        Node node4 = new Node(10);
        Node node5 = new Node(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        node2.random = node1;
        node3.random = node5;
        node4.random = node3;
        node5.random = node1;

        copyRandomList(node1);
        System.out.println("-------------");
        while (node1 != null) {
            System.out.print(node1.val + " ");
            node1 = node1.next;
        }
    }

    /**
     * 先将每个节点都进行复制，然后将复制的节点插入到被复制节点的后边。接着遍历更新被复制节点的random，最后将链表拆分成旧链表和新链表。
     * @param head
     * @return
     */
    public static Node copyRandomList(Node head) {
        if (head == null) return null;
        Node n = head;
        while (n != null) {
            Node nextNode = n.next;
            Node node = new Node(n.val);
            node.random = n.random;
            node.next = n.next;
            n.next = node;
            n = nextNode;
        }

        Node node = head;
        int i = 0;
        while (node != null) {
            if (i++ % 2 == 1 && node.random != null) {
                node.random = node.random.next;
            }
            node = node.next;
        }

        // 新链表的头结点
        Node newHead = head.next;
        Node nextNode = newHead;
        while (nextNode.next != null) {
            head.next = head.next.next;
            head = head.next;
            nextNode.next = nextNode.next.next;
            nextNode = nextNode.next;
        }
        head.next = null;
        return newHead;
    }

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
