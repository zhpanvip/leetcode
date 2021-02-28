package com.zhangpan.leetcode;

/**
 * 二叉树的遍历
 */
public class BinaryTreeTraversal {
    public static void traversalTree(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        int preValue = treeNode.val;
        traversalTree(treeNode.left);
        int inValue = treeNode.val;
        traversalTree(treeNode.right);
        int postValue = treeNode.val;
    }
}
