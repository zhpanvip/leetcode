package com.zhangpan.leetcode.array;

/**
 * 283. 移动零
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 示例:
 * <p>
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 * <p>
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/move-zeroes
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode283 {
//    public void moveZeroes(int[] nums) {
//        int k = 0;
//        for (int i = 0; i < nums.length - k; i++) {
//            if (nums[i] == 0) {
//                for (int j = i; j < nums.length - 1; j++) {
//                    nums[j] = nums[j + 1];
//                }
//                nums[nums.length - 1] = 0;
//                k++;
//                i--;
//            }
//        }
//    }
//
//    public static void moveZeroes(int[] nums) {
//        int k = 0;
//        for (int i = 0; i < nums.length - k; i++) {
//            if (nums[i] == 0) {
//                if (nums.length - 1 - i >= 0) {
//                    System.arraycopy(nums, i + 1, nums, i, nums.length - 1 - i);
//                }
//                nums[nums.length - 1] = 0;
//                k++;
//                i--;
//            }
//        }
//    }

    static int[] a = {0, 0, 1};

    public static void main(String[] args) {
        moveZeroes(a);
    }

//    public static void moveZeroes(int[] nums) {
//        int j = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                nums[j] = nums[i];
//                j++;
//            }
//        }
//
//        for (int i = j; i < nums.length; i++) {
//            nums[i] = 0;
//        }
//    }

    /**
     * 用两个指针同时从0位置开始移动，一个快指针为i,一个慢指针j。快指针每次都移动，慢指针只有在指向的位置不等于0的时候
     * 才移动一次，并将快指针指向的值赋值给慢指针的位置。这样当快指针j指向数组最后一个元素的时候，慢指针i指向位置之后的
     * 所有元素都应该是0，因此，从慢指针i的位置开始遍历，将所有值改为0。
     *
     */
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

}
