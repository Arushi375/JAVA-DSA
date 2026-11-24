// Last updated: 11/24/2026, 7:23:46 AM
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        if(nums.length==0){
4            return 0;
5        }
6        int [][]dp=new int [nums.length][nums.length];
7        for(int [] row:dp){
8        Arrays.fill(row,-1);
9        }
10        return func(0,-1,nums,dp);
11
12    }
13    public int func(int index,int prevIndex,int []nums,int [][]dp){
14        if(index==nums.length){
15            return 0;
16        }
17        if(dp[index][prevIndex+1]!=-1){
18            return dp[index][prevIndex+1];
19        }
20        int notTake=func(index+1,prevIndex,nums,dp);
21        int take=0;
22        if(prevIndex==-1||nums[index]>nums[prevIndex]){
23            take=1+func(index+1,index,nums,dp);
24        }
25        return dp[index][prevIndex+1]=(Math.max(take,notTake));
26        
27    }
28}