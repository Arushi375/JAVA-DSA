// Last updated: 9/9/2026, 9:08:10 AM
1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3        int dp[][]=new int[obstacleGrid.length][obstacleGrid[0].length];
4        for (int[] row : dp) Arrays.fill(row, -1);
5        int m=obstacleGrid.length;
6        int n=obstacleGrid[0].length;
7        return func(m-1,n-1,obstacleGrid,dp);
8    }
9    private int func(int i , int j, int[][]matrix,int [][]dp){
10        if(i>=0&&j>=0&&matrix[i][j]==1){return 0;}
11        if (i == 0 && j == 0) return 1;
12        if(i<0||j<0) {return 0;}
13        if(dp[i][j]!=-1) {return dp[i][j];}
14        int down=func(i-1,j,matrix,dp);
15        int left=func(i,j-1,matrix,dp);
16        return dp[i][j]=down+left;
17    }
18}