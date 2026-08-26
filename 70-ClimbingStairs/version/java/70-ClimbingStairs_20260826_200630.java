// Last updated: 8/26/2026, 8:06:30 PM
1class Solution {
2    public int climbStairs(int n) {
3        if(n==0)return 1;
4        if(n==1)return 1;
5        int dp[]=new int[n+1];
6        dp[0]=1;
7        dp[1]=1;
8        for(int i=2;i<=n;i++){
9            dp[i]=dp[i-1]+dp[i-2];
10        }
11        return dp[n];
12        
13    }
14}