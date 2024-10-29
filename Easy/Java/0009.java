/*
Given an integer x, return true if x is a palindrome, and false otherwise.
*/

class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int n = x;
        int newN = 0;
        int d = 0;
        if (n >= 0) {
            while (num != 0) {
                d = num % 10;
                newN = (newN * 10) + d;
                num = num / 10;
            }
        }

        if (newN == n) {
            return true;
        } else {
            return false;

        }
    }
}