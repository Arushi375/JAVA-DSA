// Last updated: 10/31/2026, 9:09:21 PM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int goal=nums.length-1;
4        boolean []dp=new boolean[nums.length];
5
6        Arrays.fill(dp,false);
7        dp[nums.length-1]=true;
8
9        for(int i=nums.length-2;i>=0;i--){
10            if(i+nums[i]>=goal){
11                dp[i]=true;
12                goal=i;
13            }
14        }
15        return dp[0];
16    }
17}