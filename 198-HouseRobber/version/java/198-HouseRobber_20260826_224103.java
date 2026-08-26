// Last updated: 8/26/2026, 10:41:03 PM
/*
 * House Robber — Approach with Reasoning
 * 
 * The main question we ask at every house is:
 * 
 * Should I rob this house or skip it?
 * 
 * If I rob house i, I cannot rob house i-1, because they are adjacent.
 * 
 * So there are two possibilities:
 * 
 * Skip house i
 * Best money = dp[i-1]
 * Rob house i
 * Then house i-1 must be skipped.
 * Best money = dp[i-2] + nums[i]
*/

1class Solution {
2    public int rob(int[] nums) {
3        int dp[]=new int [nums.length+1];
4        if(nums.length==1)return nums[0];
5        dp[0]=nums[0];
6        dp[1]=Math.max(nums[0],nums[1]);
7       
8        for(int i=2;i<nums.length;i++)
9        {
10            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
11        }
12        return dp[nums.length-1];
13    }
14}