// Last updated: 10/30/2026, 11:07:04 AM
1class Solution {
2    public int longestPalindromeSubseq(String s) {
3        String text1=s;
4        String text2 = new StringBuilder(s).reverse().toString();
5
6        int n=text1.length();
7        int m=text2.length();
8        int [][]dp=new int [n+1][m+1];
9        for(int i=0;i<=n;i++){
10            dp[i][0]=0;
11        }
12        for(int j=0;j<=m;j++){
13            dp[0][j]=0;
14        }
15        for(int i=1;i<=n;i++){
16            for(int j=1;j<=m;j++){
17                if(text1.charAt(i-1)==text2.charAt(j-1)){
18                dp[i][j]=1+dp[i-1][j-1];
19                }
20                else{
21                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
22                }
23            }
24        }
25        return dp[n][m];
26    }
27}