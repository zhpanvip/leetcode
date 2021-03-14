package com.zhangpan.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 144. 二叉树的前序遍历
 * 给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * 输入：root = [1,null,2,3]
 * 输出：[1,2,3]
 * <p>
 * 示例 2：
 * 输入：root = []
 * 输出：[]
 * <p>
 * 示例 3：
 * 输入：root = [1]
 * 输出：[1]
 * <p>
 * 示例 4：
 * 输入：root = [1,2]
 * 输出：[1,2]
 * <p>
 * 示例 5：
 * 输入：root = [1,null,2]
 * 输出：[1,2]
 * <p>
 * 提示：
 * 树中节点数目在范围 [0, 100] 内
 * -100 <= Node.val <= 100
 * <p>
 * https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 */
public class LeetCode144 {
    /**
     * 迭代法前序遍历
     *
     * @return 遍历结果
     */
    public List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        if (root == null) {
            return results;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode treeNode = stack.pop();
            results.add(treeNode.val);
            if (treeNode.right != null) {
                stack.push(treeNode.right);
            }
            if (treeNode.left != null) {
                stack.push(treeNode.left);
            }
        }
        return results;
    }

    List<Integer> list = new ArrayList<>();

    /**
     * 递归法前序遍历
     */
    public List<Integer> preorderTraversal(TreeNode treeNode) {
        if (treeNode == null) {
            return list;
        }
        list.add(treeNode.val);
        preorderTraversal(treeNode.left);
        preorderTraversal(treeNode.right);
        return list;
    }
}
