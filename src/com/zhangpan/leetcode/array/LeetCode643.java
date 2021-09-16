package com.zhangpan.leetcode.array;

/**
 * 给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数。
 * <p>
 * 示例：
 * <p>
 * 输入：[1,12,-5,-6,50,3], k = 4
 * 输出：12.75
 * 解释：最大平均数 (12-5-6+50)/4 = 51/4 = 12.75
 * <p>
 * 提示：
 * <p>
 * 1 <= k <= n <= 30,000。
 * 所给数据范围 [-10,000，10,000]。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-average-subarray-i
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode643 {

    public static void main(String[] args) {
        int[] nums = new int[]{4, 2, 1, 3, 3};
        double maxAverage2 = findMaxAverage2(nums, 2);
        System.out.println(maxAverage2);
    }

//  public double findMaxAverage(int[] nums, int k) {
//    int sum = 0;
//    for (int i = 0; i < k; i++) {
//      sum += nums[i];
//    }
//    if (nums.length == k) {
//      return (double) sum / k;
//    }
//    int maxSum = sum;
//    if (k == 1) {
//      for (int i = 1; i < nums.length - 1; i++) {
//        maxSum = Math.max(maxSum, nums[i]);
//      }
//      return maxSum;
//    }
//    for (int i = 0; i < nums.length - k; i++) {
//      sum = sum - nums[i] + nums[i + k];
//      maxSum = Math.max(maxSum, sum);
//    }
//    return (double) maxSum / k;
//  }

    public static double findMaxAverage2(int[] nums, int k) {
        if (nums == null) {
            return 0;
        }
        int maxNum = 0;
        int left = 0;
        int right = left + k - 1;
        for (int i = 0; i < k; i++) {
            maxNum += nums[i];
        }
        if (nums.length == k) {
            return (double) maxNum / k;
        }
        if (k == 1) {
            for (int i = 1; i < nums.length - 1; i++) {
                maxNum = Math.max(maxNum, nums[i]);
            }
            return maxNum;
        }
        int sum = maxNum;
        while (right < nums.length - 1) {
            sum = sum - nums[left] + nums[++right];
            left++;
            if (sum > maxNum) {
                maxNum = sum;
            }
        }
        return (double) maxNum / k;
    }


    public double findMaxAverage(int[] nums, int k) {
        double resultSum = 0;
        for (int i = 0; i < k; i++) {
            resultSum += nums[i];
        }
        double maxNum = resultSum;
        for (int i = k; i < nums.length; i++) {
            resultSum = resultSum + nums[i] - nums[k];
            maxNum = Math.max(maxNum, resultSum);
        }
        return resultSum / k;
    }
}
