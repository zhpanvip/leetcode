package com.zhangpan.leetcode.tree;

/**
 * 226. 翻转二叉树
 * <p>
 * 翻转一棵二叉树。
 * <p>
 * 示例：
 * <p>
 * 输入：
 * <p>
 * 4
 * /   \
 * 2     7
 * / \   / \
 * 1   3 6   9
 * 输出：
 * <p>
 * 4
 * /   \
 * 7     2
 * / \   / \
 * 9   6 3   1
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/invert-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode226 {

    // 从子节点开始交换
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode leftNode = invertTree(root.left);
        TreeNode rightNode = invertTree(root.right);
        root.left = rightNode;
        root.right = leftNode;
        return root;
    }

    // 从父节点开始交换
    public TreeNode invertTree2(TreeNode root) {
        if (root == null) return null;
        TreeNode node = root.right;
        root.right = root.left;
        root.left = node;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
