// Last updated: 10/31/2026, 1:13:13 AM
1class Solution {
2    public int numDecodings(String s) {
3        if(s.length()==0||s.charAt(0)=='0'){
4            return 0;
5        }
6        int []dp=new int[s.length()+1];
7        dp[0]=1;
8        dp[1]=1;
9        for(int i=2;i<=s.length();i++){
10            int ways=0;
11            if(s.charAt(i-1)!='0'){
12                ways+=dp[i-1];
13            }
14            int num=Integer.parseInt(s.substring(i-2,i));
15            if(num>=10&&num<=26){
16                ways+=dp[i-2];
17            }
18            dp[i]=ways;
19        }
20        return dp[s.length()];
21    }
22    
23}