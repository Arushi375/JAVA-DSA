// Last updated: 8/14/2026, 7:30:43 AM
/*
 * Used greedy approach to solve 
 * ALGORITHM USED: activity selection 
 * be careful while sorting for Integer.min and max values use .compare instead
*/

1class Solution {
2    public int findMinArrowShots(int[][] points) {
3        Arrays.sort(points,(a,b) -> Integer.compare(a[1],b[1]));
4        int count=1;
5        int lastTime=points[0][1];
6        int n=points.length;
7        for(int i=0;i<n;i++){
8            if(points[i][0]>lastTime){
9                count++;
10                lastTime=points[i][1];
11            }
12        }
13        return count;
14    }
15}