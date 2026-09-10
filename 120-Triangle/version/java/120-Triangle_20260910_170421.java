// Last updated: 9/10/2026, 5:04:21 PM
1class Solution {
2    public int minimumTotal(List<List<Integer>> triangle) {
3        int n=triangle.size();
4        int [][]dp=new int[n][n];
5        for (int j = 0; j < n; j++) {
6            dp[n - 1][j] = triangle.get(n - 1).get(j);
7        }
8        for (int i = n - 2; i >= 0; i--) {
9            for (int j = i; j >= 0; j--) {
10                // Take min of down and diagonal
11                int down = triangle.get(i).get(j) + dp[i + 1][j];
12                int diag = triangle.get(i).get(j) + dp[i + 1][j + 1];
13                dp[i][j] = Math.min(down, diag);
14            }
15        }
16        return dp[0][0];
17    }
18}