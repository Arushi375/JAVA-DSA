// Last updated: 8/13/2026, 3:24:17 PM
/*
 * used greedy approach 
 * ALGORITHM USED - ACTIVITY SELECTION
*/

1class Solution {
2    public int findLongestChain(int[][] pairs) {
3        Arrays.sort(pairs,(a,b) -> a[1]-b[1]);
4        int count=1;
5        int n=pairs.length;
6        int lastLength=pairs[0][1];
7        for(int i=1;i<n;i++){
8            if(pairs[i][0]>lastLength){
9                lastLength=pairs[i][1];
10                count++;
11            }
12        }
13        return count;
14    }
15}