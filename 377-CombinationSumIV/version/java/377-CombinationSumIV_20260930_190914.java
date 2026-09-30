// Last updated: 9/30/2026, 7:09:14 PM
1class Solution {
2    public int combinationSum4(int[] nums, int target) {
3        int [][]dp=new int[nums.length][target+1];
4        for(int [] row:dp){
5            Arrays.fill(row,-1);
6        }
7        return func(nums,nums.length-1,target,dp);
8    }
9    public int func(int nums[],int index,int target,int [][]dp){
10        if(target==0){
11            return 1;
12        }
13        if (index < 0) {
14            return 0;
15        }
16        if(dp[index][target]!=-1){
17            return dp[index][target];
18        }
19        int notTake=func(nums,index-1,target,dp);
20        int take=0;
21        if(nums[index]<=target){
22            take=func(nums,nums.length-1,target-nums[index],dp);
23        }
24        return dp[index][target]=take+notTake;
25    }
26}