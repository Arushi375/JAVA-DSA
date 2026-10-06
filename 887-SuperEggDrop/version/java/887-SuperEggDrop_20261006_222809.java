// Last updated: 10/6/2026, 10:28:09 PM
1class Solution {
2    public int superEggDrop(int k, int n) {
3
4        long[] dp = new long[k + 1];
5
6        int moves = 0;
7
8        while (dp[k] < n) {
9
10            moves++;
11
12            for (int e = k; e >= 1; e--) {
13
14                dp[e] = dp[e] + dp[e - 1] + 1;
15            }
16        }
17
18        return moves;
19    }
20}