// Last updated: 7/28/2026, 5:10:59 PM
class Solution {
    public boolean search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return true;
            }
            //if array at high and low is same as mid then we cant determine which side of the array is sorted hence we increment the low pointer and decrement the high pointer 
            if(nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
            }
            //left side is sorted
            else if(nums[mid]>=nums[low]){
                if(target<=nums[mid]&&target>=nums[low]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            //right side is sorted
            else{
                if(target<=nums[high]&&target>=nums[mid]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return false;
    }
}