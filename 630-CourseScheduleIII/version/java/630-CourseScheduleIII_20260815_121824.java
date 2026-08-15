// Last updated: 8/15/2026, 12:18:24 PM
/*
 * Sort courses by deadline, keep taking courses, but whenever the current time exceeds a deadline, remove the course with the largest duration.
 * 
 * A max heap is perfect for this.
 * 
 * Algorithm
 * 
 * For every course:
 * 
 * Sort by deadline.
 * Add its duration to currTime.
 * Put its duration into a max heap.
 * If currTime > deadline:
 * Remove the longest course.
 * Subtract its duration from currTime.
 * 
 * At the end:
 * 
 * heap.size()
 * 
 * is the maximum number of courses.
*/

1class Solution {
2    public int scheduleCourse(int[][] courses) {
3        int max_course=0;
4        Arrays.sort(courses, (a,b)-> a[1]-b[1]);
5        int currTime=0;
6        int count=0;
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