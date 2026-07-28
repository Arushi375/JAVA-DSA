// Last updated: 7/28/2026, 5:10:17 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int j;
        j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
}