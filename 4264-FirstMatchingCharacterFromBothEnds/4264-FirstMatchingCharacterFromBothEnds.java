// Last updated: 7/28/2026, 5:09:03 PM
class Solution {
    public int firstMatchingIndex(String s) {
        for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)==s.charAt(s.length()-i-1))
                {
                    return i;
                }
            }
        return -1;
    }
}