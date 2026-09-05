// Last updated: 9/5/2026, 4:11:31 PM
1class Solution {
2     private int func(int i, int j, int[][] dp) {
3        // Base case
4        if (i == 0 && j == 0) return 1;
5
6        // If we go out of bounds, there are no ways
7        if (i < 0 || j < 0) return 0;
8        
9        // If already computed, return it
10        if (dp[i][j] != -1)
11            return dp[i][j];
12
13        // Recursive calls for up and left moves
14        int up = func(i - 1, j, dp);
15        int left = func(i, j - 1, dp);
16
17        // Store the result and return
18        return dp[i][j] = up + left;
19    }
20
21    // Function to count total unique paths
22    public int uniquePaths(int m, int n) {
23        // DP array initialized with -1
24        int[][] dp = new int[m][n];
25        for (int[] row : dp)
26            Arrays.fill(row, -1);
27
28        return func(m - 1, n - 1, dp);
29    }
30}