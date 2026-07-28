// Last updated: 7/28/2026, 5:10:08 PM
class Solution {
    public int splitArray(int[] nums, int k) {
        int largestMinSum=Integer.MIN_VALUE;
        int min=0;
        int max=0;
        for(int i:nums){
            max+=i;
            if(min<i){
                min=i;
            }
        }
        int low=min;
        int high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            int noOfElements=noOfElements(nums,mid);
            if(noOfElements>k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
    public int noOfElements(int arr[],int m){
        int splits=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]<=m){
                sum+=arr[i];
            }
            else{
                splits++;
                sum=arr[i];
            }
        }
        return splits;
    }
    

}