package com.zhangpan.leetcode.tree;

public class LeetCode101 {
    public boolean isSymmetric(TreeNode root) {
        return checkSubTree(root, root);
    }

    private boolean checkSubTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && checkSubTree(p.right, q.left) && checkSubTree(p.left, q.right);
    }
}
