// Last updated: 11/24/2026, 8:16:42 AM
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        if(nums.length==0){
4            return 0;
5        }
6        int []dp=new int[nums.length];
7        Arrays.fill(dp,1);
8        int max=1;
9        for(int index=0;index<nums.length;index++){
10            for(int prev=0;prev<index;prev++){
11                if(nums[prev]<nums[index]){
12                    dp[index]=Math.max(dp[index],1+dp[prev]);
13                    max=Math.max(max,dp[index]);
14                }
15            }
16        }
17        return max;
18    }
19}