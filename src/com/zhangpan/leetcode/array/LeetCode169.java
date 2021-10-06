package com.zhangpan.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;

public class LeetCode169 {
    // 使用HashMap
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer size = map.get(nums[i]);
            map.put(nums[i], size == null ? 1 : ++size);
        }
        int n = nums.length / 2;
        for (int key : map.keySet()) {
            if (map.get(key) > n)
                return key;
        }
        return 0;
    }

    public int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

}
