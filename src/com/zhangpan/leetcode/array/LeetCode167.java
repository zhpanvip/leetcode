package com.zhangpan.leetcode.array;

/**
 * 167. 两数之和 II - 输入有序数组
 * 给定一个已按照 非递减顺序排列 的整数数组numbers ，请你从数组中找出两个数满足相加之和等于目标数 target 。
 * 函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。numbers 的下标 从 1 开始计数 ，所以答案数组应当满足 1 <= answer[0] < answer[1] <= numbers.length 。
 * 你可以假设每个输入 只对应唯一的答案 ，而且你 不可以 重复使用相同的元素。
 * <p>
 * 示例 1：
 * <p>
 * 输入：numbers = [2,7,11,15], target = 9
 * 输出：[1,2]
 * 解释：2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode167 {
//    public int[] twoSum(int[] numbers, int target) {
//        int[] result = new int[2];
//        for (int i = 0; i < numbers.length; i++) {
//            int t = target - numbers[i];
//            for (int j = i + 1; j < numbers.length; j++) {
//                if (t == numbers[j]) {
//                    result[0] = i + 1;
//                    result[1] = j + 1;
//                    break;
//                }
//            }
//        }
//        return result;
//    }
//
//    public int[] twoSum(int[] numbers, int target) {
//        int[] result = new int[2];
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (map.containsKey(numbers[i])) {
//                result[0] = map.get(numbers[i]) + 1;
//                result[1] = i + 1;
//            }
//            map.put(target - numbers[i], i);
//        }
//
//        return result;
//    }

    /**
     * 由于是一个有序数组，因此可以使用双指针，一个指针指向数组头，另一个指针指向数组尾。如果两个指针位置的元素相加小于target
     * 那么就让左指针向右移动一次，如果相加之和大于target，则让右指针向左移动一次，如果相加等于target，则返回向指针的位置即可。
     * 边界条件是左指针小于右指针
     */
    public int[] twoSum(int[] numbers, int target) {
        int p1 = 0, p2 = numbers.length - 1;
        while (p1 <= p2) {
            if (numbers[p1] + numbers[p2] > target) {
                p2--;
            } else if (numbers[p1] + numbers[p2] < target) {
                p1++;
            } else {
                return new int[]{p1 + 1, p2 + 1};
            }
        }

        return new int[]{-1,-1};
    }
}
