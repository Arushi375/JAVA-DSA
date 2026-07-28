// Last updated: 7/28/2026, 5:11:08 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int num:nums)
        {
            sum=sum+num;
            max=max<sum?sum:max;
            sum=sum<0?0:sum;
        }
        return max;
    }
}