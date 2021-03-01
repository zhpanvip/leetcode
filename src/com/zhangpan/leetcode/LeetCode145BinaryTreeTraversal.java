package com.zhangpan.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树的遍历 对应LeetCode
 * 144题前序遍历二叉树：https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 * 94题中序遍历二叉树：https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 * 145题后序遍历二叉树：https://leetcode-cn.com/problems/binary-tree-postorder-traversal/
 */
public class LeetCode145BinaryTreeTraversal {

    public static void main(String[] args) {

    }

    List<Integer> list = new ArrayList<>();

    /**
     * 递归法后序遍历
     *
     * @return 遍历结果
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return list;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        list.add(root.val);
        return list;
    }

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

    /**
     * 迭代法中序遍历
     *
     * @return 中序遍历遍历结果
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        if (root == null) {
            return results;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (true) {
            // 将该树最左的所有节点入栈
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }

            if (stack.isEmpty()) {
                break;
            }

            TreeNode leftNode = stack.pop();
            results.add(leftNode.val);

            cur = leftNode.right;
        }
        return results;
    }

    /**
     * 迭代法后序遍历
     *
     * @param root 二叉树的根节点
     * @return 后序遍历结果
     */
    public List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) {
            return result;
        }
        TreeNode cur = root;
        TreeNode pre = null;
        while (true) {

            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }

            if (stack.isEmpty()) {
                break;
            }

            TreeNode peek = stack.peek();
            if (peek.right == null || peek.right == pre) {
                TreeNode top = stack.pop();
                result.add(top.val);
                pre = top;
            } else {
                cur = peek.right;
            }

        }
        return result;
    }

    /**
     * 递归法前中后遍历
     */
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
