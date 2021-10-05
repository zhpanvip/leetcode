package com.zhangpan.leetcode.array;

/**
 * 53. 最大子序和
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 示例 1：
 *
 * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出：6
 * 解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
 * 示例 2：
 *
 * 输入：nums = [1]
 * 输出：1
 * 示例 3：
 *
 * 输入：nums = [0]
 * 输出：0
 * 示例 4：
 *
 * 输入：nums = [-1]
 * 输出：-1
 * 示例 5：
 *
 * 输入：nums = [-100000]
 * 输出：-100000
 *
 * https://leetcode-cn.com/problems/maximum-subarray/
 */
public class LeetCode53 {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0)
                // 如果sum>0,则sum+num可能会更大
                sum += num;
            else
                // 如果sum<=0,则sum+num一定小于等于num，所以，让sum直接等于num是当前最大值
                sum = num;
            // 把每次最大的结果都保存到res中
            res = Math.max(res, sum);
        }
        return res;
    }
}
