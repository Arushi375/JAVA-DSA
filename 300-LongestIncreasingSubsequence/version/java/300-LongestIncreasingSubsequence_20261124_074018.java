// Last updated: 11/24/2026, 7:40:18 AM
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        if(nums.length==0){
4            return 0;
5        }
6        int n=nums.length;
7        int [][]dp=new int [nums.length+1][nums.length+1];
8        for(int ind=n-1;ind>=0;ind--){
9            for(int prev=ind-1;prev>=-1;prev--){
10                int notTake=dp[ind+1][prev+1];
11                int take=0;
12                if(prev==-1||nums[ind]>nums[prev]){
13                    take=1+dp[ind+1][ind+1];
14                }
15                dp[ind][prev+1]=(Math.max(take,notTake));
16            }
17        }
18        
19        return dp[0][-1+1];
20
21    }
22    
23}