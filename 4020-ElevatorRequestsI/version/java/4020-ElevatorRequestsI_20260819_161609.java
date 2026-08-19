// Last updated: 8/19/2026, 4:16:09 PM
1class Solution {
2    public int elevatorRequests(int n, int[] requests) {
3        int currentFloor=0;
4        int time=0;
5        for(int request:requests){
6            if(currentFloor!=request){
7                time+=Math.abs(currentFloor-request);
8                currentFloor=request;
9            }
10        }
11        return time;
12    }
13}