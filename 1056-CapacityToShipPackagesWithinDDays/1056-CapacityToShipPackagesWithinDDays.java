// Last updated: 7/28/2026, 5:09:32 PM
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
            if(max<weights[i]){
                max=weights[i];
            }
        }
        int low=max;
        int high=sum;
        while(low<=high){
            int mid=low+(high-low)/2;
            int noOfDays=noOfDays(weights,mid);
            if(noOfDays<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    private int noOfDays(int weights[],int capacity){
        int day=1;
        int load=0;
        for(int i=0 ;i<weights.length;i++){
            if(load+weights[i]>capacity){
                day=day+1;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return day;
    }
}