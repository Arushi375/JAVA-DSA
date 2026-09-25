// Last updated: 9/25/2026, 9:41:30 AM
1class Solution {
2    public boolean canPartition(int[] nums) {
3        int sum=0;
4        for (int i=0;i<nums.length;i++){
5            sum+=nums[i];
6        }
7        if (sum%2 != 0) return false;
8
9        Boolean dp[][]=new Boolean[nums.length][sum/2+1];
10        
11        return partition(dp,sum/2,nums.length-1,nums);
12    }
13    public boolean partition(Boolean [][]dp,int k,int index,int []nums){
14        if(k==0){
15            return true;
16        }
17        if(index==0){
18            return (nums[0]==k);
19
20        }
21        if(dp[index][k] != null){
22            return dp[index][k];
23        }
24        boolean notTake=partition(dp,k,index-1,nums);
25        boolean take=false;
26        if(k>=nums[index]){
27            take=partition(dp,k-nums[index],index-1,nums);
28        }
29        return dp[index][k]=(take||notTake);
30    }
31}