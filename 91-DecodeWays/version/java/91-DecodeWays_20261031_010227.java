// Last updated: 10/31/2026, 1:02:27 AM
1class Solution {
2    public int numDecodings(String s) {
3        if(s.length()==0||s.charAt(0)=='0'){
4            return 0;
5        }
6        int []dp=new int[s.length()];
7        Arrays.fill(dp,-1);
8        return func(s,s.length()-1,dp);
9    }
10    public int func(String s,int idx,int []dp){
11        if(idx<0){
12            return 1;
13        }
14        int ways=0;
15        if(dp[idx]!=-1){
16            return dp[idx];
17        }
18        if(s.charAt(idx)!='0'){
19             ways+=func(s,idx-1,dp);
20        }
21       
22        // take 1 number
23       
24        // take 2 numbers
25        if(idx>=1){
26            int num=Integer.parseInt(s.substring(idx-1,idx+1));
27            if(num>=10&&num<=26){
28                ways+=func(s,idx-2,dp);
29            }
30        }
31        
32        return dp[idx]=ways;
33    }
34}