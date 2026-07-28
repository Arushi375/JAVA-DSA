// Last updated: 7/28/2026, 5:10:19 PM
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int mid=0,low=0,high=n-1;
        int ans=n;
        while(low<=high){
            mid=low+(high-low)/2;
            if(isBadVersion(mid)){
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