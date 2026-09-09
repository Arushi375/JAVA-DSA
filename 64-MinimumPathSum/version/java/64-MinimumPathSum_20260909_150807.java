// Last updated: 9/9/2026, 3:08:07 PM
1class Solution {
2    public int minPathSum(int[][] grid) {
3        int m=grid.length;
4        int n=grid[0].length;
5        int [][]dp=new int[m][n];
6        for (int row[]:dp){Arrays.fill(row,-1);}
7        return func(m-1,n-1,dp,grid);
8    }
9    private int func(int i,int j,int [][]dp,int [][] grid){
10        if(i==0&&j==0){
11            return grid[0][0];
12        }
13        if(i<0||j<0){
14            return (int) 1e9;
15        }
16        if(dp[i][j]!=-1){
17            return dp[i][j];
18        }
19        int up=grid[i][j]+func(i-1,j,dp,grid);
20        int left=grid[i][j]+func(i,j-1,dp,grid);
21        return dp[i][j]=Math.min(up,left);
22    }
23}