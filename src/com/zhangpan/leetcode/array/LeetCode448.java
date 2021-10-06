package com.zhangpan.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class LeetCode448 {
    /**
     * 暴力法
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            boolean contains = false;
            for (int j = 0; j < nums.length; j++) {
                if (i == nums[j]) {
                    contains = true;
                }
            }
            if (!contains) {
                list.add(i);
            }
        }
        return list;
    }

    /**
     * 使用哈希表
     */
    public List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i] - 1] = ++arr[nums[i] - 1];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                list.add(i + 1);
            }
        }
        return list;
    }

}
