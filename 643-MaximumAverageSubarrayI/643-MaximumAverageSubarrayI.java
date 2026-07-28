// Last updated: 7/28/2026, 5:09:53 PM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0,r=k-1;
        int sum=0,maxSum=0;
        for (int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxSum=sum;
        while(r<nums.length-1){
            sum=sum-nums[l];
            l++;
            r++;
            sum=sum+nums[r];
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum*1.0/k;
    }
}