// Last updated: 7/28/2026, 5:11:16 PM
class Solution {
    public int removeElement(int[] nums, int val) {
        int i,j=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        return j;
    }
}