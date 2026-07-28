// Last updated: 7/28/2026, 5:09:46 PM
class Solution {
    private long calculateTotalSpeed(int[] piles, int speed){
    long totalTime = 0;

    for(int bananas : piles){
        totalTime += (long)Math.ceil((double)bananas / speed);
    }

    return totalTime;
}
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high =0;
        
        for(int i=0;i<piles.length;i++){
            if(piles[i]>high){high=piles[i];}
        }
        int ans=high;
        int mid=0;
        while(low<=high){
            mid=(low+high)/2;
            long k=calculateTotalSpeed(piles,mid);
            if(k<=h){
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