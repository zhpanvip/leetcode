package com.zhangpan.leetcode.tree;

public class LeetCode110 {
    public boolean isBalanced(TreeNode root) {
        if (root == null || (root.right == null && root.left == null)) {
            return true;
        }
        return Math.abs(getTreeDepth(root.left) - getTreeDepth(root.right)) <= 1 && isBalanced(root.right) && isBalanced(root.left);
    }

    private int getTreeDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(getTreeDepth(node.right), getTreeDepth(node.left)) + 1;
    }
}
