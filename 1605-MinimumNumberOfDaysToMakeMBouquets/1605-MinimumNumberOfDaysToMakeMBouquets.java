// Last updated: 7/28/2026, 5:09:17 PM
class Solution {
    boolean possible (int [] arr,int day,int m,int k){
            int count=0;
            int num=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]<=day){
                    count++;
                }
                else{
                    num+=count/k;
                    count=0;
                }
            }
            num+=count/k;
            return num >= m;
        }
    public int minDays(int[] bloomDay, int m, int k) {
        
        int n=bloomDay.length;
        int ans=-1;
        int minDay=Integer.MAX_VALUE,maxDay=0;
        if((long)m*k>n){return -1;}
        for (int bloom : bloomDay) {
            minDay = Math.min(minDay, bloom);
            maxDay = Math.max(maxDay, bloom);
        }
        int low=minDay;
        int high=maxDay;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(bloomDay,mid,m,k)){
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