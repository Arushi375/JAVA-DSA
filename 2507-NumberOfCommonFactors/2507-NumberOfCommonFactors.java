// Last updated: 7/28/2026, 5:09:09 PM
class Solution {
    public int commonFactors(int a, int b) {
        int commonFactor=0;
        int n=0;
        if(a>b){n=a;}
        else{n=b;}
        for(int i=1;i<=n;i++)
        {
            if(a%i==0&&b%i==0)
            {
                commonFactor+=1;
            }
        }
        return commonFactor;
    }
}