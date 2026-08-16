// Last updated: 8/16/2026, 10:21:36 PM
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        int contentChildren=0;
4        Arrays.sort(g);
5        Arrays.sort(s);
6        int child=0;
7        int cookie=0;
8        while(cookie<s.length&&child<g.length){
9            if(s[cookie]>=g[child]){
10               contentChildren+=1;
11               cookie++;
12               child++; 
13            }
14            else if(s[cookie]<g[child]){
15                cookie++;
16            }
17            
18        }
19        return contentChildren;
20    }
21}