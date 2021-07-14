/*
Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.

example 1:
Input: x = 121
Output: true

link: https://leetcode.com/problems/palindrome-number/
 */

class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int startNum = x;
        int num = 0;
        if(x>=0) {
            while (x != 0) {
                int number = num * 10 + x % 10;
                num = number;
                x = x / 10;
            }
        }
        if(num != startNum) {
            return false;
        }
        else {
            return true;
        }
    }
}
