package com.zhangpan.leetcode.dynamic;

/**
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 *
 * 示例 1：
 *
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 * 示例 2：
 *
 * 输入：s = "cbbd"
 * 输出："bb"
 * 示例 3：
 *
 * 输入：s = "a"
 * 输出："a"
 * 示例 4：
 *
 * 输入：s = "ac"
 * 输出："a"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode005 {
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }
        int maxLen = 1;
        int begin = 0;
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            // 长度为1的字串一定是回文串
            dp[i][i] = true;
        }
        char[] chars = s.toCharArray();
        // l表示枚举字符串长度,长度应该小于等于s的长度
        for (int l = 2; l <= len; l++) {
            // i表示子串的起点，i表示坐标，所以只能小于s的长度
            for (int i = 0; i < len; i++) {
                // j 表示字串的终点
                int j = i + l - 1;
                // 超过字符串的长度，重新开始
                if (j >= len) {
                    break;
                }
                // 只有起点和终点相等，i到j的这个字串才有可能是回文串
                if (chars[i] == chars[j]) {
                    if (j - i <= 2) {
                        // 当字串长度为2或者3时，起点和终点相等，那么一定是回文串
                        dp[i][j] = true;
                    } else {
                        // 当字串长度大于3时，除了起点与终点相等之外，中间的字串必须也要满足是回文串
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                if (dp[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }
}
