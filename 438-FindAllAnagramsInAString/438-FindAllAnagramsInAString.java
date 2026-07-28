// Last updated: 7/28/2026, 5:10:04 PM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap <Character,Integer> hm=new HashMap<>();
        int l=0,r=0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<p.length();i++){
            hm.put(p.charAt(i),hm.getOrDefault(p.charAt(i),0)+1);
        }
        int count=0;
        int len=p.length();
        while(r<s.length()){
            char ch1=s.charAt(r);
            if(hm.getOrDefault(ch1,0)>0){
                count++;
            }
            hm.put(ch1,hm.getOrDefault(ch1,-1)-1);
            if(r-l+1>len){
                char ch2=s.charAt(l);
                hm.put(ch2,hm.getOrDefault(ch2,0)+1);
                    if(hm.get(ch2)>0)
                    {
                            count--;
                    }
                l++;
            }
            if(count==len&&r-l+1==len){
                list.add(l);
            }
            r++;
        }
        return list;
    }
}