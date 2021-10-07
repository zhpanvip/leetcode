package com.zhangpan.leetcode.string;

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

  /**
   * 解题思路：
   * 双指针法，左指针指向起始位置，右指针指向末尾位置。左指针如果不是字母或者数字就不断加1，
   * 右指针如果不是字母或者数字就不断减1。左右指针都指向数字的时候比较两个字符是否相等（忽略大小写），
   * 如果不相等，则返回false，如果相等，则继续比较下一个，直到所有字符对比完成，则返回true。
   *
   *
   */
  public boolean isPalindrome1(String s) {
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
