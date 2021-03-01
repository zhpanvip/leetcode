package com.zhangpan.leetcode;

/**
 * 二分查找
 * 给定一个n个元素有序的（升序）整型数组nums 和一个目标值target ，写一个函数搜索nums中的 target，如果目标值存在返回下标，否则返回 -1。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-search
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode704BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 20, 25, 30, 44, 62};
        int i = binSearch(arr, 7);
        System.out.println("查找到了：" + i);
    }

    public static int binSearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) >> 1;
            if (key < arr[mid]) {
                right = mid - 1;
            } else if (key > arr[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


//    public static int binSearch(int[] array, int key) {
//        int left = 0;
//        int right = array.length - 1;
//        int mid;
//        while (left <= right) {
//            mid = (left + right) >> 1;
//            if (key < array[mid]) {
//                right = mid - 1;
//            } else if (key > array[mid]) {
//                left = mid + 1;
//            } else if (key == array[mid]) {
//                return mid;
//            }
//        }
//        return -1;
//    }

//    public static int binSearch(int[] array, int key) {
//        int left = 0;
//        int right = array.length - 1;
//        int mid;
//        while (right >= left) {
//            mid = (right + left) >>1;
//            if (key < array[mid]) {
//                right = mid - 1;
//            } else if (key > array[mid]) {
//                left = mid + 1;
//            } else if (key == array[mid]) {
//                return mid;
//            }
//        }
//        return -1;
//    }
}
