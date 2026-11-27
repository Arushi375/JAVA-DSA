// Last updated: 11/27/2026, 7:42:59 AM
1class Solution {
2    public int findLongestChain(int[][] pairs) {
3        if(pairs.length==0){
4            return 0;
5        }
6        Arrays.sort(pairs,(a,b)->a[1]-b[1]);
7        int []dp=new int[pairs.length];
8        Arrays.fill(dp,1);
9        int max=1;
10        for(int index=0;index<pairs.length;index++){
11            for(int prev=0;prev<index;prev++){
12                if(pairs[prev][1]<pairs[index][0]){
13                    dp[index]=Math.max(dp[index],1+dp[prev]);
14                    max=Math.max(max,dp[index]);
15                }
16                
17            }
18        }
19        return max;
20    }
21}