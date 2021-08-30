package com.zhangpan.leetcode.sort;

import static com.zhangpan.leetcode.sort.BubbleSort.bubbleSort;
import static com.zhangpan.leetcode.sort.QuickSort.quickSort;

/**
 * 912. 排序数组
 * 给你一个整数数组nums，请你将该数组升序排列。
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [5,2,3,1]
 * 输出：[1,2,3,5]
 * 示例 2：
 * <p>
 * 输入：nums = [5,1,1,2,0,0]
 * 输出：[0,0,1,1,2,5]
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 50000
 * -50000 <= nums[i] <= 50000
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-an-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode912 {

    public static void main(String[] args) {
        int[] nums = {28, 20, -1, 108, 22, 7, 5, 30, 98, 65, 32};
        bubbleSort(nums);
        quickSort(nums, 0, nums.length - 1);
        for (int num : nums) System.out.print(num + " ");
    }

    public static int[] swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return nums;
    }
}
