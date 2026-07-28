// Last updated: 7/28/2026, 5:09:06 PM
class Solution {
    public boolean isGood(int[] nums) {
       Arrays.sort(nums);
        if(nums.length<2){
            return false;
        }
        for(int i=0;i<nums.length-2;i++)
        {
            if(nums[i]!=i+1){return false;}
        }
        int n=nums.length-1;
        return nums[n-1]==n && nums[n]==n;
       }
    }
