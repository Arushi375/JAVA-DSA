// Last updated: 7/28/2026, 5:09:15 PM
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int missingNo=arr[mid]-(mid+1);
            if(missingNo<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return high+k+1;
    }
}