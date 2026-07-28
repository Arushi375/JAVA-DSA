// Last updated: 7/28/2026, 5:09:27 PM
class Solution {
    public int numberOfSubstrings(String s) {
        int l=0,r=0,count=0;
        int chCount[]=new int[3];
        for(r=0;r<s.length();r++){
            chCount[s.charAt(r)-'a']++;
            while(chCount[0]>0&&chCount[1]>0&&chCount[2]>0){
                count+=s.length()-r;
                chCount[s.charAt(l)-'a']--;
                l++;
            }
        }
        return count;
    }
}