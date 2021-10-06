package com.zhangpan.leetcode.tree;

/**
 * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
 *
 *
 * 示例 :
 * 给定二叉树
 *
 *           1
 *          / \
 *         2   3
 *        / \
 *       4   5
 * 返回3, 它的长度是路径 [4,2,1,3] 或者[5,2,1,3]。
 *
 *
 * 注意：两结点之间的路径长度是以它们之间边的数目表示。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/diameter-of-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode543 {
    int res;

    public int diameterOfBinaryTree(TreeNode root) {
        getTreeDepth(root);
        return 0;
    }

    private int getTreeDepth(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = getTreeDepth(root.left);
        int rightDepth = getTreeDepth(root.right);
        res = Math.max(res, rightDepth + leftDepth + 1);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
