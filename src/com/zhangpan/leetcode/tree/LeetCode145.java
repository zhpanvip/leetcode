package com.zhangpan.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *145. 二叉树的后序遍历
 * 给定一个二叉树，返回它的 后序 遍历。
 *
 * 示例:
 *
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
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
}
