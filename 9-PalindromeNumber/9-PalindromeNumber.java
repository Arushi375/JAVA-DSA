// Last updated: 7/28/2026, 5:11:23 PM
class Solution {
    public boolean isPalindrome(int x) {
        int r,num=0,testNum=x;
        while(x!=0)
        {
            r=x%10;
            num=num*10+r;
            x=x/10;
        }
        if(testNum<0){
            num=0-num;
        }
        if(num==testNum)
        {
            return true;
        }
        return false;
    }
}