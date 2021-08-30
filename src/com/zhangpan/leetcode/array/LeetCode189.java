package com.zhangpan.leetcode.array;

/**
 * 189. 旋转数组
 * <p>
 * 给定一个数组，将数组中的元素向右移动k个位置，其中k是非负数。
 * <p>
 * 进阶：
 * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 * 你可以使用空间复杂度为O(1) 的原地算法解决这个问题吗？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rotate-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode189 {
//    public void rotate(int[] nums, int k) {
//         k = k % nums.length;
//        int[] n = new int[k];
//        for (int i = 0; i < k; i++) {
//            n[i] = nums[nums.length - k + i];
//        }
//
//        for (int i = nums.length - k - 1; i >= 0; i--) {
//            nums[i + k] = nums[i];
//        }
//        for (int i = 0; i < n.length; i++) {
//            nums[i] = n[i];
//        }
//    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] n = new int[k];
        if (k >= 0) {
            System.arraycopy(nums, nums.length - k, n, 0, k);
        }
        if (nums.length - k - 1 + 1 >= 0) {
            System.arraycopy(nums, 0, nums, k, nums.length - k - 1 + 1);
        }
        if (n.length >= 0) {
            System.arraycopy(n, 0, nums, 0, n.length);
        }
    }
}
