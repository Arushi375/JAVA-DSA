// Last updated: 10/24/2026, 8:26:28 AM
1class Solution {
2    public int minCostClimbingStairs(int[] cost) {
3        int n=cost.length;
4        int prev1=0;
5        int prev2=0;
6        int cur;
7        
8        for(int i=n-1;i>=0;i--){
9            cur=cost[i]+Math.min(prev1,prev2);
10            prev1=prev2;
11            prev2=cur;
12        }
13        return Math.min(prev1,prev2);
14    }
15    
16}