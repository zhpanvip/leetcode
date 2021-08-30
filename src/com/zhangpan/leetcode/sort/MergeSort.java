package com.zhangpan.leetcode.sort;

/**
 * 归并排序是建立在归并操作上的一种有效排序算反，采用的是分治思想。这一算法充分利用了
 * 完全二叉树深度是log2(n+1)的特性，因此效率比较高。其基本原理如下：
 * 对于给定的一组记录，利用递归与分支技术将数据划分为越来越小的半子表，再对班子表排序，
 * 最后利用递归方法将排序好的半子表合并为越来越大的有序表。
 *
 * 经过第一轮比较后得到最小的记录，然后将该记录的位置与第一个记录的位置交换；接着对不包括
 * 第一个记录以外的其他记录进行第二次比较，得到最小记录与第二个位置记录交换；重复这个过程
 * 直到进行比较的记录剩下一个为止。
 *
 * 动画演示：https://www.runoob.com/wp-content/uploads/2019/03/mergeSort.gif
 * 参考连接：https://blog.csdn.net/jianyuerensheng/article/details/51262984
 */
public class MergeSort {

    public static void mergeSort(int[] a, int left, int right) {
        int mid = left + (right - left) / 2;
        if (left < right) {
            mergeSort(a, left, mid);
            mergeSort(a, mid + 1, right);
            merge(a, left, mid, right);
        }
    }

    public static void merge(int[] a, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int leftPointer = left;
        int rightPointer = mid + 1;
        int i = 0;
        while (leftPointer <= mid && rightPointer <= right) {
            if (a[leftPointer] <= a[rightPointer]) {
                temp[i++] = a[leftPointer++];
            } else {
                temp[i++] = a[rightPointer++];
            }
        }
        while (leftPointer <= mid) {
            temp[i++] = a[leftPointer++];
        }
        while (rightPointer <= right) {
            temp[i++] = a[rightPointer++];
        }
        if (temp.length >= 0) {
            System.arraycopy(temp, 0, a, left, temp.length);
        }
    }
}
