// Last updated: 7/28/2026, 5:09:28 PM
class Solution {
    private boolean isValidDivisor(int[] nums,int threshold,int mid){
        long sum=0;
        for(int num:nums){
            sum+=(long)Math.ceil((double)num/mid);
        }
        if(sum<=threshold){return true;}
        else {return false;}
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=0;
        for(int num:nums){
            if(num>high){high=num;}
        }
        int ans=0;
        while(low<=high){
            int mid=(high+low)/2;
            if(isValidDivisor(nums,threshold,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}