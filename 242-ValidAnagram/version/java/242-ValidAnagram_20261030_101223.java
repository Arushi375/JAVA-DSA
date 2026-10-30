// Last updated: 10/30/2026, 10:12:23 AM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length()!=t.length()){
4            return false;
5        }
6        HashMap<Character, Integer> map=new HashMap<>();
7        for(int i=0;i<s.length();i++){
8            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
9        }
10        for(int i=0;i<t.length();i++){
11            char ch=t.charAt(i);
12            if(!map.containsKey(ch)){
13                return false;
14            }
15            map.put(ch,map.get(ch)-1);
16            if(map.get(ch)==0){
17                map.remove(ch);
18            }
19        }
20        return map.isEmpty();
21    }
22    
23}