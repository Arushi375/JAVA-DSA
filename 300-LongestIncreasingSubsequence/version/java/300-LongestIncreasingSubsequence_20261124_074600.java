// Last updated: 11/24/2026, 7:46:00 AM
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        if(nums.length==0){
4            return 0;
5        }
6        int n=nums.length;
7        int []next=new int [nums.length+1];
8        int []curr=new int[nums.length+1];
9        for(int ind=n-1;ind>=0;ind--){
10            for(int prev=ind-1;prev>=-1;prev--){
11                int notTake=next[prev+1];
12                int take=0;
13                if(prev==-1||nums[ind]>nums[prev]){
14                    take=1+next[ind+1];
15                }
16                curr[prev+1]=(Math.max(take,notTake));
17            }
18            next=curr;
19        }
20        
21        return next[0];
22
23    }
24    
25}