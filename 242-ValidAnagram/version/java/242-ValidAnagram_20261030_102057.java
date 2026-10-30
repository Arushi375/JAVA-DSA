// Last updated: 10/30/2026, 10:20:57 AM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length()!=t.length()){
4            return false;
5        }
6        int [] freq=new int[26];
7        for(int i=0;i<s.length();i++){
8            freq[s.charAt(i)-'a']++;
9            freq[t.charAt(i)-'a']--;
10        }
11        for(int i:freq){
12            if(i!=0){
13                return false;
14            }
15        }
16        return true;
17    }
18    
19}