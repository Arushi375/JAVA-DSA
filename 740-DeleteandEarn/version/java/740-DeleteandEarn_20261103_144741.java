// Last updated: 11/3/2026, 2:47:41 PM
1class Solution {
2    public int deleteAndEarn(int[] nums) {
3        if(nums.length==0){return 0;}
4        if(nums.length==1){return nums[0];}
5        int max=0;
6        for(int i:nums){
7            max=Math.max(i,max);
8        }
9        int []dp=new int [max+1];
10        int[]sum=new int[max+1];
11        Arrays.fill(sum,0);
12        for(int i:nums){
13            sum[i]+=i;
14        }
15        dp[0]=sum[0];
16        dp[1]=Math.max(sum[0],sum[1]);
17        for(int i=2;i<=max;i++){
18            int notPick=dp[i-1];
19            int pick=dp[i-2]+sum[i];
20            dp[i]=Math.max(pick,notPick);
21        }
22        return dp[max];
23        
24
25
26    }
27    
28}