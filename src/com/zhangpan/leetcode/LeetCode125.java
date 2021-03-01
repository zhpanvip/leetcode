package com.zhangpan.leetcode;

public class LeetCode125 {

    public static void main(String[] args) {
        boolean isPalindrome = isPalindrome("raceacar");
        System.out.print("isPalindrome = " + Character.isLetterOrDigit(' '));
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
