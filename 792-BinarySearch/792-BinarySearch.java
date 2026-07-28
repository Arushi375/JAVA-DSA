// Last updated: 7/28/2026, 5:09:48 PM
class Solution {
    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1;
        int mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]< target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}