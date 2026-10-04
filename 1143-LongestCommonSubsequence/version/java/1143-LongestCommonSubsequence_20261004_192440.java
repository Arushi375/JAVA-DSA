// Last updated: 10/4/2026, 7:24:40 PM
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int n=text1.length();
4        int m=text2.length();
5        int [][]dp=new int [n+1][m+1];
6        for(int i=0;i<=n;i++){
7            dp[i][0]=0;
8        }
9        for(int j=0;j<=m;j++){
10            dp[0][j]=0;
11        }
12        for(int i=1;i<=n;i++){
13            for(int j=1;j<=m;j++){
14                if(text1.charAt(i-1)==text2.charAt(j-1)){
15                dp[i][j]=1+dp[i-1][j-1];
16                }
17                else{
18                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
19                }
20            }
21        }
22        return dp[n][m];
23    }
24    
25}