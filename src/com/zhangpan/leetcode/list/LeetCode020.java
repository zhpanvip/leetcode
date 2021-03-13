package com.zhangpan.leetcode.list;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * 20. 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *
 *
 * 示例 1：
 *
 * 输入：s = "()"
 * 输出：true
 * 示例 2：
 *
 * 输入：s = "()[]{}"
 * 输出：true
 * 示例 3：
 *
 * 输入：s = "(]"
 * 输出：false
 * 示例 4：
 *
 * 输入：s = "([)]"
 * 输出：false
 * 示例 5：
 *
 * 输入：s = "{[]}"
 * 输出：true
 */
public class LeetCode020 {
    public boolean isValid(String s) {
        int length = s.length();
        if (length % 2 == 1) {
            return false;
        }
        HashMap<Character, Character> pairs = new HashMap<>() {
            {
                put('(', ')');
                put('[', ']');
                put('{', '}');
            }
        };
        LinkedList<Character> stack = new LinkedList<>();

        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (pairs.get(c) == null) {
                if (stack.size() > 0) {
                    Character pop = stack.pop();
                    if (c != pairs.get(pop)) {
                        return false;
                    }
                } else {
                    return false;
                }

            } else {
                stack.push(c);
            }
        }
        return stack.size() == 0;
    }
}
