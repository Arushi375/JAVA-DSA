// Last updated: 7/28/2026, 5:10:33 PM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,r=0,sum=0;
        int minLength=Integer.MAX_VALUE;
        while(r<nums.length){
            sum+=nums[r];
            while(sum>=target){
                sum-=nums[l];
                minLength=Math.min(minLength,r-l+1);
                l++;
            }
            r++;
        }
        return minLength==Integer.MAX_VALUE?0:minLength ;
    }
}