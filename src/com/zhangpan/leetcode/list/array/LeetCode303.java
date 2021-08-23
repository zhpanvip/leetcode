package com.zhangpan.leetcode.list.array;

/**
 * 给定一个整数数组 nums，求出数组从索引i到j（i≤j）范围内元素的总和，包含i、j两点。
 * <p>
 * 实现 NumArray 类：
 * <p>
 * NumArray(int[] nums) 使用数组 nums 初始化对象
 * int sumRange(int i, int j) 返回数组 nums 从索引i到j（i≤j）范围内元素的总和，包含i、j两点（也就是 sum(nums[i], nums[i + 1], ... , nums[j])）
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/range-sum-query-immutable
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode303 {
    private final int[] sums;

    public LeetCode303(int[] nums) {
        int n = nums.length;
        sums = new int[n + 1];
        for (int i = 0; i < n; i++) {
            sums[i + 1] = sums[i] + sums[i + 1];
        }
    }

    public int sumRange(int i, int j) {
        return sums[j + 1] - sums[i];
    }

    //private final int[] nums;
    //public NumArray(int[] nums) {
    //    this.nums=nums;
    //}
    //
    //public int sumRange(int left, int right) {
    //    if(nums==null){
    //        return 0;
    //    }
    //    int sum = 0;
    //    for(;left<=right;left++){
    //        sum += nums[left];
    //    }
    //    return sum;
    //}
}
