// Last updated: 7/28/2026, 5:10:06 PM
class Solution {
    public int characterReplacement(String s, int k) {
    HashMap <Character,Integer> hm=new HashMap<>();
     int maxLength=0,l=0,r=0,maxFreq=0;
     while (r < s.length()) {
        char ch = s.charAt(r);
        hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        maxFreq = Math.max(maxFreq, hm.get(ch));
        if ((r - l + 1) - maxFreq > k) {
            char leftChar = s.charAt(l);
            hm.put(leftChar, hm.get(leftChar) - 1);
            l++;
        }
        if ((r - l + 1) - maxFreq <= k) {
            maxLength = Math.max(maxLength, r - l + 1);
        }
            r++;
    }
     return maxLength;
    }
}