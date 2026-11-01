// Last updated: 11/1/2026, 12:11:57 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3        if(nums.length==0){
4            return 0;
5        }
6        if(nums.length==1){
7            return nums[0];
8        }
9
10        int curMax=nums[0];
11        int curMin=nums[0];
12        int ans=curMax;
13        for(int i=1;i<nums.length;i++){
14            int temp=curMax;
15            curMax=Math.max(temp*nums[i],Math.max(curMin*nums[i],nums[i]));
16            curMin=Math.min(temp*nums[i],Math.min(curMin*nums[i],nums[i]));
17            ans=Math.max(ans,curMax);
18        }
19        return ans;
20    }
21}