package com.zhangpan.leetcode.array;

/**
 * 977. 有序数组的平方
 * <p>
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 * <p>
 * https://leetcode-cn.com/problems/squares-of-a-sorted-array/
 */
public class LeetCode977 {

    public static void main(String[] args) {

    }

    public int[] sortedSquares(int[] nums) {
        if (nums[0] >= 0) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[i] * nums[i];
            }
            return nums;
        } else if (nums[nums.length - 1] <= 0) {
            int[] newArray = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                newArray[i] = nums[nums.length - 1 - i] * nums[nums.length - 1 - i];
            }
            return newArray;
        } else {
            int[] newArray = new int[nums.length];
            int i = 0, j = nums.length - 1, k = nums.length - 1;
            while (i <= j) {
                int ii = nums[i] * nums[i];
                int jj = nums[j] * nums[j];
                if (ii >= jj) {
                    newArray[k--] = ii;
                    i++;
                } else {
                    newArray[k--] = jj;
                    j--;
                }
            }
            return newArray;
        }
    }



}
