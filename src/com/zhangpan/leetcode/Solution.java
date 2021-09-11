package com.zhangpan.leetcode;

public class Solution {
    /**
     * 解题思路：
     * 双指针法，左指针指向起始位置，右指针指向末尾位置。左指针如果不是字母或者数字就不断加1，
     * 右指针如果不是字母或者数字就不断减1。左右指针都指向数字的时候比较两个字符是否相等（忽略大小写），
     * 如果不相等，则返回false，如果相等，则继续比较下一个，直到所有字符对比完成，则返回true。
     *
     *
     */
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        // 循环终止条件，左指针小于右指针
        while (left < right) {
            // 左指针如果指向的不是字母或数字则不断加1，需要保证left小于right
            // 注意这里 Character.isLetterOrDigit 的API
            while (!Character.isLetterOrDigit(s.charAt(left)) && left < right) {
                left++;
            }
            // 右指针如果指向的不是字母或数字，则不断减1，同样需要保证左指针小于右指针
            while (!Character.isLetterOrDigit(s.charAt(right)) && left < right) {
                right--;
            }
            // 忽略大小写，比较左右指针指向的字符是否相等，注意Character.toLowerCase的API
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                // 不相等，则不是回文字符，返回false
                return false;
            }
            // 完成一次对比左指针加1，右指针减1
            left++;
            right--;
        }
        return true;
    }
}
