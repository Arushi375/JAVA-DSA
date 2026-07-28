// Last updated: 7/28/2026, 5:09:43 PM
class Solution {
    public int totalFruit(int[] fruits) {
        int l=0,r=0,n1=-1,n2=-1,maxLength=0;
        if(fruits.length<=2){return fruits.length;}
        while(r<fruits.length){
            if(n1==-1||fruits[r]==n1){
                n1=fruits[r];
            }
            else if(n2==-1|| n2==fruits[r]){
                n2=fruits[r];
            }
            else{
                int prev=fruits[r-1];
                l=r-1;
                while(l>=0&&fruits[l]==prev){
                    l--;
                }
                l++;
                n1=prev;
                n2=fruits[r];
            }
            maxLength=Math.max(maxLength,r-l+1);
            r++;
        }
        return maxLength;

    }
}