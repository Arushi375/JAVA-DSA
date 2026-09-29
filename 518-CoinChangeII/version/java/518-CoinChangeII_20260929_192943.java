// Last updated: 9/29/2026, 7:29:43 PM
1class Solution {
2    public int change(int amount, int[] coins) {
3
4        int n = coins.length;
5        int[][] dp = new int[n][amount + 1];
6
7        // Base case
8        for (int t = 0; t <= amount; t++) {
9            if (t % coins[0] == 0) {
10                dp[0][t] = 1;
11            } else {
12                dp[0][t] = 0;
13            }
14        }
15
16        for (int index = 1; index < n; index++) {
17
18            for (int target = 0; target <= amount; target++) {
19
20                int notTake = dp[index - 1][target];
21
22                int take = 0;
23
24                if (coins[index] <= target) {
25                    take = dp[index][target - coins[index]];
26                }
27
28                dp[index][target] = take + notTake;
29            }
30        }
31
32        return dp[n - 1][amount];
33    }
34}