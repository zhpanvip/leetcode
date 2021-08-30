package com.zhangpan.leetcode.sort;

public class QuickSort {
    /**
     * 快速排序
     * <p>
     * 核心的思路是取第一个元素（或者最后一个元素）作为分界点，把整个数组分成左右两侧，左边的元素小于或者等于分界点元素，
     * 而右边的元素大于分界点元素，然后把分界点移到中间位置，对左右子数组分别进行递归，最后就能得到一个排序完成的数组。
     * 当子数组只有一个或者没有元素的时候就结束这个递归过程。
     */
    public static void quickSort(int[] nums, int left, int right) {
        if (left > right) return;
        int key = nums[left];
        int l = left;
        int r = right;
        while (l < r) {
            while (nums[r] >= key && l < r)
                r--;
            while (nums[l] <= key && l < r)
                l++;
            if (l < r)
                LeetCode912.swap(nums, r, l);
        }

        nums[left] = nums[r];
        nums[r] = key;

        quickSort(nums, left, r - 1);
        quickSort(nums, r + 1, right);
    }
}
