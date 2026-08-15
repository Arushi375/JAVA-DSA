// Last updated: 8/15/2026, 8:45:47 PM
// used maxheap
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        PriorityQueue<Integer> maxHeap=new PriorityQueue<>((a,b)->b-a);
4        for(int i=0;i<nums.length;i++){
5            maxHeap.offer(nums[i]);
6        }
7        for(int i=0;i<k-1;i++){
8            maxHeap.poll();
9        }
10        return maxHeap.poll();
11    }
12}