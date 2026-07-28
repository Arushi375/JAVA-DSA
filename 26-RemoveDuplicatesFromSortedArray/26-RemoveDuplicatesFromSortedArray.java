// Last updated: 7/28/2026, 5:11:17 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=0;
        while(i<nums.length)
        {
            if(nums[i]==nums[j])
            {
                i++;
            }
            else{
                nums[j+1]=nums[i];
                j++;
            }
        }
        return j+1;
    }
}