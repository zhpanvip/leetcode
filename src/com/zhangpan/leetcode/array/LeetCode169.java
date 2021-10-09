package com.zhangpan.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * 169. 多数元素
 *
 *给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于⌊ n/2 ⌋的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 *
 * 示例1：
 *
 * 输入：[3,2,3]
 * 输出：3
 * 示例2：
 *
 * 输入：[2,2,1,1,1,2,2]
 * 输出：2
 *
 * 进阶：
 *
 * 尝试设计时间复杂度为 O(n)、空间复杂度为 O(1) 的算法解决此问题。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/majority-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
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
