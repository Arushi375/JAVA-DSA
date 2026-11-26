// Last updated: 11/26/2026, 8:32:39 PM
1class Solution {
2    public int findNumberOfLIS(int[] nums) {
3        if(nums.length==0){
4            return 0;
5        }
6        int []dp=new int[nums.length];
7        int []count=new int[nums.length];
8        Arrays.fill(dp,1);
9        Arrays.fill(count,1);
10        
11        for(int index=0;index<nums.length;index++){
12            for(int prev=0;prev<index;prev++){
13                if(nums[prev]<nums[index]){
14                    if(dp[prev]+1>dp[index])
15                    {
16                        dp[index]=dp[prev]+1;
17                        count[index]=count[prev];
18                    }
19                    else if(dp[prev]+1==dp[index])
20                    {
21                        count[index]+=count[prev];
22                    }   
23                }
24                
25            }
26        }
27        int max=0;
28        for(int i=0;i<nums.length;i++){
29            max=Math.max(dp[i],max);
30        }
31        int sum=0;
32        for(int i=0;i<nums.length;i++){
33            if(dp[i]==max){
34                sum+=count[i];
35            }
36        }
37        return sum;
38    }
39}