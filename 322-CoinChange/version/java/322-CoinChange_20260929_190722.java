// Last updated: 9/29/2026, 7:07:22 PM
1import java.util.*;
2
3class Solution {
4    public int coinChange(int[] coins, int amount) {
5
6        int n = coins.length;
7
8        int[] prev = new int[amount + 1];
9        int[] curr = new int[amount + 1];
10
11        // Base case
12        for (int t = 0; t <= amount; t++) {
13            if (t % coins[0] == 0) {
14                prev[t] = t / coins[0];
15            } else {
16                prev[t] = Integer.MAX_VALUE;
17            }
18        }
19
20        for (int index = 1; index < n; index++) {
21
22            for (int target = 0; target <= amount; target++) {
23
24                int notTake = prev[target];
25
26                int take = Integer.MAX_VALUE;
27
28                if (coins[index] <= target) {
29                    int res = curr[target - coins[index]];
30
31                    if (res != Integer.MAX_VALUE) {
32                        take = 1 + res;
33                    }
34                }
35
36                curr[target] = Math.min(take, notTake);
37            }
38
39            prev = curr.clone();
40        }
41
42        int ans = prev[amount];
43
44        return (ans == Integer.MAX_VALUE) ? -1 : ans;
45    }
46}