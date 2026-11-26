// Last updated: 11/27/2026, 12:25:36 AM
1class Solution {
2    public boolean checkPossible(String s1,String s2){
3        if(s1.length()!=s2.length()+1){return false;}
4        int first=0,second=0;
5        while(first<s1.length()){
6            if(second < s2.length()&&s1.charAt(first)==s2.charAt(second)){
7                first++;
8                second++;
9            }
10            else{
11                first++;
12           
13            }
14        }
15        if(first==s1.length()&&second==s2.length()){return true;}
16        return false;
17    }
18    public int longestStrChain(String[] words) {
19        if(words.length==0){
20            return 0;
21        }
22        Arrays.sort(words, (a,b) -> a.length()-b.length());
23        int []dp=new int[words.length];
24        Arrays.fill(dp,1);
25        int max=1;
26        for(int index=0;index<words.length;index++){
27            for(int prev=0;prev<index;prev++){
28                if(checkPossible(words[index],words[prev])){
29                    dp[index]=Math.max(dp[index],1+dp[prev]);
30                    max=Math.max(max,dp[index]);
31                }
32            }
33        }
34        return max;
35    }
36}