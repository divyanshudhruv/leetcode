/*
You are given a string s.

Your task is to remove all digits by doing this operation repeatedly:

Delete the first digit and the closest non-digit character to its left.
Return the resulting string after removing all digits.
*/ 

class Solution {
    public String clearDigits(String s) {
        String result = "";
        
        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            
            if (Character.isDigit(ch)) {
                if (result.length() > 0) {
                    result = result.substring(0, result.length() - 1);
                }
                i++; 
            } else {
                result += ch;
                i++;
            }
        }
        return result;
    }
}
