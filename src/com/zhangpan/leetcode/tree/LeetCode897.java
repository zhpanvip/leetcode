package com.zhangpan.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 给你一个树，请你 按中序遍历 重新排列树，使树中最左边的结点现在是树的根，并且每个结点没有左子结点，只有一个右子结点。
 * <p>
 *  
 * <p>
 * 示例 ：
 * <p>
 * 输入：[5,3,6,2,4,null,8,1,null,null,null,7,9]
 * <p>
 * 5
 * / \
 * 3    6
 * / \    \
 * 2   4    8
 *  /        / \
 * 1        7   9
 * <p>
 * 输出：[1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
 * <p>
 * 1
 * \
 * 2
 * \
 * 3
 * \
 * 4
 * \
 * 5
 * \
 * 6
 * \
 * 7
 * \
 * 8
 * \
 * 9
 * 提示：
 * <p>
 * 给定树中的结点数介于 1 和100 之间。
 * 每个结点都有一个从 0 到 1000 范围内的唯一整数值。
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/increasing-order-search-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode897 {

    Queue<TreeNode> queue = new LinkedList<>();

    public TreeNode increasingBST(TreeNode root) {
        doTraversal(root);
        TreeNode node = queue.poll();
        TreeNode head = node;
        while (!queue.isEmpty()) {
            node.right = queue.poll();
            node.left = null;
            node = node.right;
        }
        node.left = null;
        node.right = null;
        return head;
    }


    public void doTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        doTraversal(root.left);
        queue.offer(root);
        doTraversal(root.right);
    }
}
