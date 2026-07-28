// Last updated: 7/28/2026, 5:11:04 PM
class Solution {
    public int mySqrt(int x) {
      int mid=0,high=x/2,low=0;
      int ans=0;
      if (x==0||x==1){return x;}
      while(low<=high) {
        mid=low+(high-low)/2;
        long square=(long) mid*mid;
        if(square==x){
            return mid;
        }
        else if( square < x){
            ans=mid;
            low=mid+1;
        }
        else{
            high=mid-1;
        }
      }
       return ans;
    }
}