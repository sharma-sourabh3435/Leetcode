/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go
outside the signed 32-bit integer range [-2^(31), 2^(31) - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

example 1:
Input: x = 123
Output: 321

example 2:
Input: x = -123
Output: -321

link: https://leetcode.com/problems/reverse-integer/
 */

class ReverseInteger {
    public static int reverse(int x) {
        int num = 0;
        while(x != 0) {
            int number = num*10 + x%10;

            if((number - x%10)/10 != num) {
                return 0;
            }
            else {
                num = number;
            }
            x = x / 10;
        }
        return num;
    }
}
