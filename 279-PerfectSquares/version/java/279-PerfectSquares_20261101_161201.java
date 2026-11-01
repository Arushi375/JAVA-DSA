// Last updated: 11/1/2026, 4:12:01 PM
1class Solution {
2    public int numSquares(int n) {
3
4        int [] dp = new int[n+1];
5
6        Arrays.fill(dp, Integer.MAX_VALUE);
7
8        dp[0] = 0;
9
10        for(int num = 1; num <= n; num++){
11
12            for(int i = 1; i*i <= num; i++){
13
14                int sq = i*i;
15
16                if(dp[num-sq] != Integer.MAX_VALUE){
17                    dp[num] = Math.min(dp[num], 1 + dp[num-sq]);
18                }
19            }
20        }
21
22        return dp[n];
23    }
24}