package com.zhangpan.leetcode.list.array;

/**
 * 912. 排序数组
 * 给你一个整数数组 nums，请你将该数组升序排列。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [5,2,3,1]
 * 输出：[1,2,3,5]
 * 示例 2：
 * <p>
 * 输入：nums = [5,1,1,2,0,0]
 * 输出：[0,0,1,1,2,5]
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 50000
 * -50000 <= nums[i] <= 50000
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-an-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode912Sort {


    public static void main(String[] args) {
        int[] nums = {28, 20, -1, 108, 22, 7, 5, 30, 98, 65, 32};
//        bubbleSort(nums);
        quickSort(nums, 0, nums.length - 1);
        for (int num : nums) System.out.print(num + " ");
    }

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
                swap(nums, r, l);
        }

        nums[left] = nums[r];
        nums[r] = key;

        quickSort(nums, left, r - 1);
        quickSort(nums, r + 1, right);
    }


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
                    swap(nums, j, j + 1);
                }
            }
        }
    }

    public static int[] swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return nums;
    }
}
