// Last updated: 10/6/2026, 9:59:33 PM
1
2import java.util.Arrays;
3
4class Solution {
5    int[][] dp;
6
7    public int superEggDrop(int k, int n) {
8        dp = new int[k + 1][n + 1];
9
10        for (int[] row : dp) {
11            Arrays.fill(row, -1);
12        }
13
14        return solve(k, n);
15    }
16
17    public int solve(int k, int n) {
18        if (n == 0 || n == 1) {
19            return n;
20        }
21
22        if (k == 1) {
23            return n;
24        }
25
26        if (dp[k][n] != -1) {
27            return dp[k][n];
28        }
29
30        int low = 1;
31        int high = n;
32        int ans = Integer.MAX_VALUE;
33
34        while (low <= high) {
35            int mid = low + (high - low) / 2;
36
37            int broken = solve(k - 1, mid - 1);
38            int survived = solve(k, n - mid);
39
40            int worst = 1 + Math.max(broken, survived);
41            ans = Math.min(ans, worst);
42
43            if (broken < survived) {
44                low = mid + 1;
45            } else {
46                high = mid - 1;
47            }
48        }
49
50        return dp[k][n] = ans;
51    }
52}
53