/*
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack
, or -1 if needle is not part of haystack.
*/

class Solution {
    public int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        
        if (needleLength == 0) {
            return 0;
        }

        for (int i = 0; i <= haystackLength - needleLength; i++) {
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }
        
        return -1;
    }
}
