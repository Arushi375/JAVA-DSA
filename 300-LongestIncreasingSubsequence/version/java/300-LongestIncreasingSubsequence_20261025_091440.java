// Last updated: 10/25/2026, 9:14:40 AM
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        int n=nums.length;
4        int dp[][]=new int[n][n];
5        for(int []row:dp){
6            Arrays.fill(row,-1);
7        }
8        return func(nums,0,-1,dp);
9    }
10    public int func(int [] nums,int index,int prev,int[][]dp){
11        if(index>=nums.length){return 0;}
12        if(dp[index][prev+1]!=-1){
13            return dp[index][prev+1];
14        }
15        int notake=func(nums,index+1,prev,dp);
16        int take=0;
17        if(prev==-1||nums[prev]<nums[index]){
18            take=1+func(nums,index+1,index,dp);
19        }
20        return dp[index][prev+1]=Math.max(take,notake);
21        
22
23
24    }
25}
26