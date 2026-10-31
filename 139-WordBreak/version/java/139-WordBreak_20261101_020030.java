// Last updated: 11/1/2026, 2:00:30 AM
1class Solution {
2    public boolean wordBreak(String s, List<String> wordDict) {
3        Boolean [] dp=new Boolean[s.length()];
4        return check(s,wordDict,0,0,dp);
5    }
6    public boolean check(String s, List<String> wordDict,int startIndex, int endIndex,Boolean []dp){
7        if(startIndex==s.length()){
8            return true;
9        }
10        if(endIndex>=s.length()){
11            return false;
12        }
13        if(dp[startIndex]!=null){
14            return dp[startIndex];
15        }
16        if(wordDict.contains(s.substring(startIndex,endIndex+1))){
17            // Choice 1: Continue searching for a longer word
18            boolean skip = check(s, wordDict, startIndex, endIndex + 1,dp);
19
20            // Choice 2: Select this word and move forward
21            boolean take = check(s, wordDict, endIndex + 1, endIndex + 1,dp);
22
23            return dp[startIndex]=take || skip;
24        }
25        return dp[startIndex]=check(s,wordDict,startIndex,endIndex+1,dp);
26        
27    }
28}
29