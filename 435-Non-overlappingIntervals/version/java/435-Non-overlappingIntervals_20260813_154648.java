// Last updated: 8/13/2026, 3:46:48 PM
// used greedy approach - activity selection problem
1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
4        int count=1;
5        int n=intervals.length;
6        int lastInt=intervals[0][1];
7        for(int i=1;i<n;i++){
8            if(intervals[i][0]>=lastInt){
9                lastInt=intervals[i][1];
10                count++;
11            }
12        }
13        return n-count;
14    }
15}