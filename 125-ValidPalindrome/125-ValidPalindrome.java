// Last updated: 7/28/2026, 5:10:53 PM
class Solution {
    public boolean isPalindrome(String s) {
        boolean isPalin=true;
       int i=s.length()-1;
       int j=0;
       while(j<i)
       {
        char ch1=Character.toLowerCase(s.charAt(i));
        char ch2=Character.toLowerCase(s.charAt(j));
        if(!Character.isLetterOrDigit(ch1))
        {
            i--;
        }
        else if(!Character.isLetterOrDigit(ch2))
        {
            j++;
        }
        else{
        if(ch1!=ch2)
        {
            isPalin=false;
            break;
        }
        j++;
        i--;
       }
       }
        return isPalin;
    }
}