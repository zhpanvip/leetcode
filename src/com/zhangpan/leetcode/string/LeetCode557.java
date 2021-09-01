package com.zhangpan.leetcode.string;

/**
 * 557. 反转字符串中的单词 III
 * <p>
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 * <p>
 * 示例：
 * <p>
 * 输入："Let's take LeetCode contest"
 * 输出："s'teL ekat edoCteeL tsetnoc"
 * <p>
 * 提示：
 * <p>
 * 在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-words-in-a-string-iii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode557 {

    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int p1 = 0, p2 = 0, index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[index] == ' ' || i == chars.length - 1) {
                p2 = index;
                reverseWord(chars, p1, p2);
                p1 = index + 2;
            }
            index++;
        }

        return new String(chars);
    }

    private void reverseWord(char[] chars, int p1, int p2) {
        while (p1 < p2) {
            char temp = chars[p1];
            chars[p1] = chars[p2];
            chars[p2] = temp;
            p1++;
            p2--;
        }
    }

//    public String reverseWords(String s) {
//        String[] words = s.split(" ");
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < words.length; i++) {
//            String resultWord = reverseWord(words[i]);
//            result.append(resultWord);
//            if (i != words.length - 1) {
//                result.append(" ");
//            }
//        }
//        return result.toString();
//    }
//
//    private String reverseWord(String word) {
//        char[] chars = word.toCharArray();
//        int p1 = 0, p2 = chars.length - 1;
//        while (p1 < p2) {
//            char temp = chars[p1];
//            chars[p1] = chars[p2];
//            chars[p2] = temp;
//            p1++;
//            p2--;
//        }
//        return new String(chars);
//    }
}
