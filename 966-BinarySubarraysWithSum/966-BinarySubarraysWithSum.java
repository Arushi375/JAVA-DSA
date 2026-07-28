// Last updated: 7/28/2026, 5:09:41 PM
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return findMaxSubarrays(nums, goal)-findMaxSubarrays(nums, goal-1);
    }
    private int findMaxSubarrays(int[] nums, int goal){
        int l=0,r=0,count=0,sum=0;
        if(goal<0){return 0;}
        while(r<nums.length){
            sum=sum+nums[r];
            while(sum>goal){
                sum-=nums[l];
                l++;
            }
            count+=(r-l+1);
            r++;
        }
        return count;
    }
}