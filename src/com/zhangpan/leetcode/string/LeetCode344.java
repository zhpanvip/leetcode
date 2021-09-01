package com.zhangpan.leetcode.string;

/**
 * 344. 反转字符串
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 * <p>
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * <p>
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode344 {
    /**
     * 通过双指针方式实现，第一个指针指向数组头，第二个指针指向数组尾，
     * 交换指针出的元素，然后左指针+1，右指针-1.直到左指针大于等于右指针停止。
     */
    public void reverseString(char[] s) {
        int p1 = 0, p2 = s.length - 1;
        while (p1 < p2) {
            swap(s, p1, p2);
            p1++;
            p2--;
        }
    }

    public void swap(char[] c, int p1, int p2) {
        char temp = c[p1];
        c[p1] = c[p2];
        c[p2] = temp;
    }
}
