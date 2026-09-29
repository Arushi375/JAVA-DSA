// Last updated: 9/29/2026, 7:04:43 PM
1
2
3class Solution {
4    public int coinChange(int[] coins, int amount) {
5
6        int n = coins.length;
7
8        int[][] dp = new int[n][amount + 1];
9
10        // Base case: index == 0
11        for (int t = 0; t <= amount; t++) {
12            if (t % coins[0] == 0) {
13                dp[0][t] = t / coins[0];
14            } else {
15                dp[0][t] = Integer.MAX_VALUE;
16            }
17        }
18
19        for (int index = 1; index < n; index++) {
20            for (int target = 0; target <= amount; target++) {
21
22                int notTake = dp[index - 1][target];
23
24                int take = Integer.MAX_VALUE;
25
26                if (coins[index] <= target) {
27                    int res = dp[index][target - coins[index]];
28
29                    if (res != Integer.MAX_VALUE) {
30                        take = 1 + res;
31                    }
32                }
33
34                dp[index][target] = Math.min(take, notTake);
35            }
36        }
37
38        int ans = dp[n - 1][amount];
39
40        return (ans == Integer.MAX_VALUE) ? -1 : ans;
41    }
42}