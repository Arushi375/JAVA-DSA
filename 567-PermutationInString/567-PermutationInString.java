// Last updated: 7/28/2026, 5:09:54 PM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l=0,r=0;
        HashMap <Character,Integer> hm=new HashMap<>();
        int count=0;
        int len=s1.length();
        for(int i=0;i<s1.length();i++){
            hm.put(s1.charAt(i),hm.getOrDefault(s1.charAt(i),0)+1);
        }
        while(r<s2.length()){
            char ch1=s2.charAt(r);
            if(hm.getOrDefault(ch1,0)>0){
                count++;
            }
            hm.put(ch1,hm.getOrDefault(ch1,0)-1);
            if(r-l+1>len){
                char ch2=s2.charAt(l);
                hm.put(ch2,hm.getOrDefault(ch2,0)+1);
                    if(hm.get(ch2)>0)
                    {
                            count--;
                    }
                l++;
            }
            if(count==len){
                return true;
            }
            r++;
        }
        return false;
    }
}