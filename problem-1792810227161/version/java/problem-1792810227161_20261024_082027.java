// Last updated: 10/24/2026, 8:20:27 AM
1class Solution {
2    public int minCostClimbingStairs(int[] cost) {
3        int n=cost.length;
4        int[] dp=new int[n+1];
5        Arrays.fill(dp,-1);
6        return Math.min(func(0,cost,dp),func(1,cost,dp));
7    }
8    public int func(int n,int []cost,int []dp){
9        if(n>=cost.length){return 0;}
10        if(dp[n]!=-1){return dp[n];}
11        int step1=func(n+1,cost,dp);
12        int step2=func(n+2,cost,dp);
13        return dp[n]=Math.min(step1,step2)+cost[n];
14    }
15}