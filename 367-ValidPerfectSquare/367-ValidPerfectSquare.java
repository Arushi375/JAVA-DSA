// Last updated: 7/28/2026, 5:10:10 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        int left=0;
        int right=num/2;
        int mid=0;
        if (num==0||num==1){return true;}
        while(left<=right){
            mid=left+(right-left)/2;
            long square=(long) mid*mid;
            if(square==num){
                return true;
            }
            else if(square<num){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return false;
    }
}