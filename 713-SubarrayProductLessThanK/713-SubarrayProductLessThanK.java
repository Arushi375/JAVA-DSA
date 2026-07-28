// Last updated: 7/28/2026, 5:09:51 PM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){return 0;}
        int left=0;
        int right=0;
        int product=1,count=0;
        for(right=0;right<nums.length;right++)
        {
            product*=nums[right];
            while(product>=k)
            {
                product/=nums[left];
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
}