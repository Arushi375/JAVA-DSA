// Last updated: 8/15/2026, 12:18:59 PM
1class Solution {
2    public int scheduleCourse(int[][] courses) {
3        
4        Arrays.sort(courses, (a,b)-> a[1]-b[1]);
5        int currTime=0;
6        
7        PriorityQueue<Integer> maxHeap =new PriorityQueue<>((a, b) -> b - a);
8        for(int [] course:courses){
9            int duration = course[0];
10            int deadline = course[1];
11
12            currTime += duration;
13            maxHeap.offer(duration);
14
15            if (currTime > deadline) {
16                currTime -= maxHeap.poll();
17            }
18        
19        }
20        return maxHeap.size();
21    }
22}