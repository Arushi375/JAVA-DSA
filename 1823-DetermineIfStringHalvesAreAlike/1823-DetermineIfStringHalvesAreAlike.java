// Last updated: 7/28/2026, 5:09:14 PM
class Solution {
    public boolean halvesAreAlike(String s) {
        HashSet <Character> hs=new HashSet();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        String str=s.toLowerCase();
        int n=str.length();
        String s1;
        s1=str.substring(0,n/2);
        String s2=str.substring(n/2);
        int v1=0,v2=0;
        boolean isAlike=false;
        for(int i=0;i<n/2;i++)
        {
            char str1=s1.charAt(i);
            char str2=s2.charAt(i);
            if(hs.contains(str1))
            {
                v1++;
            }
            if(hs.contains(str2))
            {
                v2++;
            }
        }
        if(v1==v2)
        {
            isAlike=true;
        }
        return isAlike;
        
    }
}