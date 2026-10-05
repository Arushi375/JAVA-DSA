// Last updated: 10/5/2026, 11:22:16 PM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int n=word1.length();
4        int m=word2.length();
5        int [][]dp=new int[n][m];
6        for(int []row :dp){
7            Arrays.fill(row,-1);
8        }
9        return func(word1,word2,n-1,m-1,dp);
10    }
11    private int func(String word1,String word2,int i,int j,int [][]dp){
12        if(i<0) return j+1;
13        if(j<0) return i+1;
14        if (dp[i][j]!=-1){
15            return dp[i][j];
16        }
17        if(word1.charAt(i)==word2.charAt(j)){
18            return dp[i][j]=func(word1,word2,i-1,j-1,dp);
19        }
20        return dp[i][j]=1+Math.min(func(word1,word2,i-1,j-1,dp),Math.min(func(word1,word2,i,j-1,dp),func(word1,word2,i-1,j,dp)));
21    }
22}