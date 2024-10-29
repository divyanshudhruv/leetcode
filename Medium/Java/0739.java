/*
Given an array of integers temperatures represents the daily temperatures, 
return an array answer such that answer[i] is the number of days you have to wait after the ith 
day to get a warmer temperature. If there is no future day for which this is possible, 
keep answer[i] == 0 instead.
*/
 
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        int[] stack = new int[n];
        int top = -1;

        for (int i = 0; i < n; i++) {
            while (top >= 0 && temperatures[stack[top]] < temperatures[i]) {
                int index = stack[top--];
                ans[index] = i - index;
            }
            stack[++top] = i;
        }

        return ans;
    }
}
