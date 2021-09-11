package com.zhangpan.leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class LeetCode003 {

    public static void main(String[] args) {
        lengthOfLongestSubstring("dvdf");
    }

    /**
     *  从头到尾遍历字符串，如果List集合中不包含遍历到的字符 c ，则将字符串 c 放入 List 集合中，
     *  如果包含遍历到的字符串，那么这个结合中的 size 可能就是最大值，与 maxSize 对比，将最大值保存到
     *  maxSize,然后从集合头部开始移除元素，直到集合中不包含遍历到的这个字符 c 为止,然后将字符串 c 存入集合中。
     *  字符串遍历结束后 maxSize 与 List size 的最大值即为最大字符串。
     */
    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        List<Character> list = new ArrayList<>();
        int maxSize = 0;
        for (Character c : chars) {
            if (list.size() < chars.length) {
                if (list.contains(c)) {
                    maxSize = Math.max(list.size(), maxSize);
                    while (list.size() > 0 && list.contains(c)) {
                        list.remove(0);
                    }
                }
                list.add(c);
            }
        }

        return Math.max(maxSize, list.size());
    }

//    public static int lengthOfLongestSubstring(String s) {
//        if (s.length() == 1) {
//            return 1;
//        }
//        char[] chars = s.toCharArray();
//        List<Character> list = new ArrayList<>();
//        int maxSize = 0;
//        for (int i = 0; i < chars.length; i++) {
//            int p = i;
//            list.clear();
//            char aChar = chars[p];
//            while (!list.contains(aChar)) {
//                list.add(aChar);
//                if (p < chars.length-1) {
//                    aChar = chars[++p];
//                } else {
//                    break;
//                }
//            }
//            maxSize = Math.max(maxSize, list.size());
//        }
//        return maxSize;
//    }
}
