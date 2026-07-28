// Last updated: 7/28/2026, 5:11:14 PM
class Solution {
    public int search(int[] nums, int target) {
        int mid=0;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[low]<=nums[mid]){
                if(nums[low]<=target&&target<nums[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else {
                if(nums[high]>=target&&target>nums[mid]){
                    low=mid+1;
                }
                else{
                high=mid-1;}

            }
        }
        return -1;
    }
}