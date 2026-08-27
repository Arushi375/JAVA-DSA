// Last updated: 8/28/2026, 4:31:53 AM
1class Solution {
2    public int coinChange(int[] coins, int amount) {
3        int dp[]=new int[amount+1];
4        Arrays.fill(dp,amount+1);
5        if(amount==0){
6            return 0;
7        }
8        dp[0]=0;
9        for (int i = 1; i <= amount; i++) {
10            for (int coin : coins) {
11                if (i - coin >= 0) {
12                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
13                }
14            }
15        }
16        return dp[amount] > amount ? -1 : dp[amount];
17    }
18}