// Last updated: 7/28/2026, 5:11:01 PM
class Solution {
    public String minWindow(String s, String t) {
        HashMap <Character,Integer> freq=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        int l=0,r=0;
        int count=0;
        int m=s.length();
        int n=t.length();
        int sIndex=-1;
        int minLength=Integer.MAX_VALUE;
        while(r<m){
            char ch=s.charAt(r);
            if(freq.getOrDefault(ch,0)>0){
                count+=1;
            }
            freq.put(ch,freq.getOrDefault(ch,-1)-1);
            while(count==n){
                if(r-l+1<minLength){
                    minLength=r-l+1;
                    sIndex=l;
                }
                char chr=s.charAt(l);
                freq.put(chr,freq.get(chr)+1);
                if(freq.get(chr)>0){
                    count-=1;
                }
                l++;
            }
            r++;
        }
        return sIndex==-1 ? "" : s.substring(sIndex,sIndex+minLength);

    }
}