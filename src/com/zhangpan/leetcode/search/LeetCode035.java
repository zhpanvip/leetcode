package com.zhangpan.leetcode.search;

/**
 * 35. 搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 请必须使用时间复杂度为 O(log n) 的算法。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/search-insert-position
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode035 {

    public static void main(String[] args) {
        int[] ints = {1,3,5,6};
        searchInsert(ints,2);
    }


    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid;
        // while中的条件是要小于等于，查找不到的情况下
        while (left <= right) {
            // 因为是两个int相加，需要防止相加结果超出int范围，
            mid = left + (right - left) >>2;
            if (target < nums[mid]) { // target小于nums[mid],说明在前半段
                right = mid - 1;
            } else if (target > nums[mid]) { // target大于nums[mid],说明在后半段
                left = mid + 1;
            } else {
                return mid;
            }
        }
        // 未查找到target,此时left的值大于right，插入位置在left
        return left;
    }
}
