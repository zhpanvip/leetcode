package com.zhangpan.leetcode.sort;

public class BubbleSort {


    /**
     * 冒泡排序
     * 冒泡排序从左到右依次比较两个相邻的元素，如果前一个元素比较大，就把前一个元素和后一个元素交换位置，
     * 完成一趟循环后保证了最大的元素在最后一位。接下来进行第二趟排序，第二趟排序完成后第二大的元素在倒数第二位。
     * 依次遍历直至整个数组排序完成。
     * <p>
     * 冒泡排序的时间复杂度是O(n2),空间复杂度为
     *
     * @param nums
     * @return
     */
    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    LeetCode912.swap(nums, j, j + 1);
                }
            }
        }
    }
}
