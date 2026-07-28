// Last updated: 7/28/2026, 5:10:12 PM
class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        char temp;
        int j=n-1;
        for(int i=0;i<n/2;i++)
        {
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            j--;
        }
    }
}