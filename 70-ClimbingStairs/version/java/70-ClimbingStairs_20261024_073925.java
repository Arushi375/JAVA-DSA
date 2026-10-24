// Last updated: 10/24/2026, 7:39:25 AM
1class Solution {
2    public int climbStairs(int n) {
3        int prev1=1;
4        int prev2=1;
5        int cur;
6        for(int i=2;i<=n;i++){
7            cur=prev1+prev2;
8            prev2=prev1;
9            prev1=cur;
10        }
11        return prev1;
12    }
13}