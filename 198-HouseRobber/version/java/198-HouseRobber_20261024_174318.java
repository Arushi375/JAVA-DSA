// Last updated: 10/24/2026, 5:43:18 PM
1class Solution {
2    public int rob(int[] nums) {
3        int dp[]=new int[nums.length];
4        Arrays.fill(dp,-1);
5        int n=nums.length;
6        return func(nums,n-1,dp);
7    }
8    private int func(int []nums,int n,int []dp){
9        if(n<0){return 0;}
10        if(dp[n]!=-1) {return dp[n];}
11        int take=func(nums,n-1,dp);
12        int notTake=func(nums,n-2,dp)+nums[n];
13        return dp[n]=Math.max(take,notTake);
14    }
15}