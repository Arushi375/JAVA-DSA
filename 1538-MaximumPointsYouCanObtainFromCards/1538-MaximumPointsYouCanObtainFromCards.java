// Last updated: 7/28/2026, 5:09:24 PM
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0,rsum=0,maxSum=0,r=cardPoints.length-1;
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        maxSum=lsum;
        for(int i=k-1;i>=0;i--){
            lsum-=cardPoints[i];
            rsum+=cardPoints[r];
            maxSum=Math.max(maxSum,lsum+rsum);
            r--;
        }
       return maxSum;
    }
}