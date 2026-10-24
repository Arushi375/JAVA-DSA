// Last updated: 10/24/2026, 5:54:34 PM
1class Solution {
2    public int rob(int[] nums) {
3        int dp[]=new int[nums.length+1];
4        int n=nums.length;
5        dp[0]=nums[0];
6        if(n>1){dp[1]=Math.max(nums[0],nums[1]);}
7        for (int i=2;i<nums.length;i++){
8            int notake=dp[i-1];
9            int take=dp[i-2]+nums[i];
10            dp[i]=Math.max(take,notake);
11        }
12        return dp[n-1];
13        
14    }
15}