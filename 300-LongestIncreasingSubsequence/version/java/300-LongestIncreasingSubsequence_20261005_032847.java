// Last updated: 10/5/2026, 3:28:47 AM
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        int n=nums.length;
4        int [][]dp=new int[n+1][n+1];
5        for(int i=0;i<=n;i++){
6            dp[i][n]=0;
7        }
8        for(int index=n-1;index>=0;index--){
9            for(int prev_index=index-1;prev_index>=-1;prev_index--){
10                int notTake=dp[index+1][prev_index+1];
11                int take=0;
12                if(prev_index==-1||nums[index]>nums[prev_index]){
13                    take=1+dp[index+1][index+1];
14                    
15                }
16                dp[index][prev_index+1]=Math.max(notTake,take);
17            }
18        }
19        return dp[0][-1+1];
20    }
21}