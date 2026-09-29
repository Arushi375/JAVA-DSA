// Last updated: 9/29/2026, 9:02:27 AM
1class Solution {
2    public int integerBreak(int n) {
3        int index=n;
4        if(n==2){return 1;}
5        if (n == 3) return 2;
6        int dp[][]=new int[n+1][n+1];
7        for(int[] row:dp){
8            Arrays.fill(row,-1);
9        }
10        return func(dp,index,n);
11    }
12    private int func(int [][]dp,int index,int n){
13        if(index==0){
14            return n;
15        }
16        if(dp[index][n]!=-1){
17            return dp[index][n];
18        }
19        int notTake=1*func(dp,index-1,n);
20        int take=Integer.MIN_VALUE;
21        int number=index+1;
22        if(number<=n){
23            take=index*func(dp,index,n-index);
24        }
25        return dp[index][n]=Math.max(notTake,take);
26    }
27}