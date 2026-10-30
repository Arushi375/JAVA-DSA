// Last updated: 10/31/2026, 12:21:15 AM
1class Solution {
2    public int minimumLength(String s) {
3        HashMap <Character,Integer> map=new HashMap<>();
4        char [] chr=s.toCharArray();
5        for(char ch:chr){
6            map.put(ch,map.getOrDefault(ch,0)+1);
7        }
8        int minus=0;
9        for(int value:map.values()){
10            while(value>=3){
11                minus+=2;
12                value-=2;
13            }
14        }
15        return s.length()-minus;
16    }
17}