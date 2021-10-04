package com.zhangpan.leetcode.array;

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
