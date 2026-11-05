// Last updated: 11/5/2026, 6:57:44 PM
1class Solution {
2    public int mincostTickets(int[] days, int[] costs) {
3        if(days.length==0){
4            return 0;
5        }
6        HashSet <Integer> set=new HashSet<Integer>();
7        for(int i:days){
8            set.add(i);
9        }
10        int []dp=new int [days[days.length-1]+1];
11        Arrays.fill(dp,-1);
12        return func(days,costs,set,1,dp);
13    }
14    public int func(int []days,int []costs, HashSet set,int currDay,int[]dp){
15        if(currDay>days[days.length-1]){
16            return 0;
17        }
18        if(!set.contains(currDay)){
19            return func(days,costs,set,currDay+1,dp);
20        }
21        if(dp[currDay]!=-1){
22            return dp[currDay];
23        }
24        int oneDay=costs[0]+func(days,costs,set,currDay+1,dp);
25        int sevDay=costs[1]+func(days,costs,set,currDay+7,dp);
26        int thDays=costs[2]+func(days,costs,set,currDay+30,dp);
27        
28        return dp[currDay]=Math.min(oneDay,Math.min(sevDay,thDays));
29    }
30}