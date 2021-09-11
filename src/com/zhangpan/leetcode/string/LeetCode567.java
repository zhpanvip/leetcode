package com.zhangpan.leetcode.string;


import java.util.Arrays;

public class LeetCode567 {

    public static void main(String[] args) {
        checkInclusion("hello", "helloooolleoooleh");
    }

    /**
     * s1是较短的字符串，如果s1的排列是s2的字串，那么s1中各个字符的个数与s2
     * 某个字串各个字符串的个数是相等的，则条件成立。因此可以申请两个长度为26的数组
     * 第一个数组统计s1中各个字符串的个数，第二个数组统计s2长度为s1.length的字串的各个字符个数。
     * 如果s2中存在条件成立的字串，那么两个数组是相等的。
     */
    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        if (s1.equals(s2)) {
            return true;
        }
        int[] ints1 = new int[26];
        int[] ints2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            ++ints1[s1.charAt(i) - 'a'];
            ++ints2[s2.charAt(i) - 'a'];
        }
        if (Arrays.equals(ints1, ints2)) {
            return true;
        }
        for (int i = s1.length(); i < s2.length(); i++) {
            ++ints2[s2.charAt(i) - 'a'];
            --ints2[s2.charAt(i - s1.length()) - 'a'];
            if (Arrays.equals(ints1, ints2)) {
                return true;
            }
        }
        return false;
    }
}
