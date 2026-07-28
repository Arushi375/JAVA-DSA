// Last updated: 7/28/2026, 5:10:01 PM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int j=0,sum=0;
        for(int i=1;i<num/2+1;i++)
        {
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            return true;
        }
        else{
            return false;
        }
    }
}