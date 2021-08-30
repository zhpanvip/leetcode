package com.zhangpan.leetcode.array;

/**
 * 75. 颜色分类
 * 给定一个包含红色、白色和蓝色，一共n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * <p>
 * 此题中，我们使用整数 0、1 和 2 分别表示红色、白色和蓝色。
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [2,0,2,1,1,0]
 * 输出：[0,0,1,1,2,2]
 * 示例 2：
 * <p>
 * 输入：nums = [2,0,1]
 * 输出：[0,1,2]
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-colors
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode75 {
    public void sortColors(int[] nums) {
        int p1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (i != p1)
                    swap(nums, p1, i);
                p1++;
            }
        }

        for (int i = p1; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (i != p1)
                    swap(nums, p1, i);
                p1++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
