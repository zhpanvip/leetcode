package com.zhangpan.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 145. 二叉树的后序遍历
 * 给定一个二叉树，返回它的 后序 遍历。
 * <p>
 * 示例:
 * <p>
 * 输入: [1,null,2,3]
 * 1
 * \
 * 2
 * /
 * 3
 * <p>
 * 输出: [3,2,1]
 * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-postorder-traversal/
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode145 {

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
     * 迭代法后序遍历
     *
     * @param root 二叉树的根节点
     * @return 后序遍历结果
     */
    public List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root, right = null;

        while (node != null || !stack.isEmpty()) {
            if (node != null) { // 遍历node的所有左子节点，并将其加入到栈中
                stack.push(node);
                node = node.left;
            } else {
                node = stack.peek(); // 查看栈中第一个元素，peek方法不出栈
                if (node.right != null && node.right != right) {
                    node = node.right; // 遍历node的所有右节点，并将其加入到栈中
                } else { // +
                    result.add(node.val);
                    right = node;
                    stack.pop();
                    node = null;
                }
            }
        }
        return result;
    }
}
