// Last updated: 7/28/2026, 5:11:27 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int maxlength=0;
        HashSet <Character> hs=new HashSet <> ();
        while(right<s.length()){
            
            while(hs.contains(s.charAt(right)))
            {
                hs.remove(s.charAt(left));
                left+=1;
            }
            hs.add(s.charAt(right));
            right+=1;
            maxlength=Math.max(maxlength,right-left);
        }
        return maxlength;
    }
}