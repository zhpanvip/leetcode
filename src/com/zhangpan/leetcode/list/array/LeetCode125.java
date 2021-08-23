package com.zhangpan.leetcode.list.array;

/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 *
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 *
 * 输入: "race a car"
 * 输出: false
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-palindrome
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode125 {

  public static void main(String[] args) {
    boolean isPalindrome = isPalindrome("A man, a plan, a canal: Panama");
    System.out.print("isPalindrome = " + isPalindrome);
  }

  public static boolean isPalindrome(String s) {
    int right = s.length() - 1;
    int left = 0;
    while (left < right) {
      char leftChar = s.charAt(left);
      while (!Character.isLetterOrDigit(leftChar) && left < right) {
        leftChar = s.charAt(++left);
      }
      char rightChar = s.charAt(right);
      while (!Character.isLetterOrDigit(rightChar) && left < right) {
        rightChar = s.charAt(--right);
      }
      if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }

/*    public static boolean isEqualsAlphaChar(char c1, char c2) {
        return isAlphChar(c1) && isAlphChar(c2) && Math.abs(c1 - c2) == 'a' - 'A';
    }

    public static boolean isAlphChar(char c) {
        return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
    }

    public static boolean isValidChar(char c) {
        return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9';
    }*/
}
