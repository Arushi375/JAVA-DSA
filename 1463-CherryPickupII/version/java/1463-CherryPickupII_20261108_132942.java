// Last updated: 11/8/2026, 1:29:42 PM
1class Solution {
2    public int cherryPickup(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5
6        int[][][] dp = new int[m][n][n];
7
8        for (int[][] layer : dp) {
9            for (int[] row : layer) {
10                Arrays.fill(row, -1);
11            }
12        }
13
14        return solve(0, 0, n - 1, grid, dp);
15    }
16    public int solve(int i,int j1,int j2,int[][]grid,int [][][]dp){
17        int m = grid.length;
18        int n = grid[0].length;
19        if(j1<0||j1>=n||j2<0||j2>=n){
20            return Integer.MIN_VALUE;
21        }
22        if (dp[i][j1][j2] != -1) {
23            return dp[i][j1][j2];
24        }
25        if(i==m-1){
26            if(j1==j2){
27                return grid[i][j1];
28            }
29            return grid[i][j1]+grid[i][j2];
30        }
31        int cherries=grid[i][j1];
32        if(j1!=j2){
33            cherries+=grid[i][j2];
34        }
35        int maxCherries=Integer.MIN_VALUE;
36        for(int d1=-1;d1<=1;d1++){
37            for(int d2=-1;d2<=1;d2++){
38                int next=solve(i+1,j1+d1,j2+d2,grid,dp);
39                maxCherries=Math.max(maxCherries,next);
40            }
41        }
42        return dp[i][j1][j2]=maxCherries+cherries;
43
44
45        
46    }
47}