// Last updated: 10/30/2026, 3:36:18 PM
1class Solution {
2    public String longestPalindrome(String s) {
3        String str="";
4        int res=0;
5        int l,r;
6        for(int i=0;i<s.length();i++){
7            l=i;r=i;
8            while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
9                if(r-l+1>res){
10                    res=r-l+1;
11                    str=s.substring(l,r+1);
12                }
13                l--;
14                r++;
15            }
16            l=i;r=i+1;
17            while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
18                if(r-l+1>res){
19                    res=r-l+1;
20                    str=s.substring(l,r+1);
21                }
22                l--;
23                r++;
24            }
25        }
26        return str;
27    }
28}