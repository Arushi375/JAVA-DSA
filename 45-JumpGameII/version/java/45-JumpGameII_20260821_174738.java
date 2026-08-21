// Last updated: 8/21/2026, 5:47:38 PM
/*
 * We need to reach the last index with the minimum number of jumps. Instead of trying all possible paths (as in brute force), we use a greedy approach. At every step, we try to go as far as we can within the current jump range.We treat each jump as moving through levels in a graph, updating the range of indices we can reach in the next jump.
 * Start from the first index in the array.
 * Keep track of the furthest index you can reach so far in the current jump range.
 * Iterate through each index up to the second-last element.
 * For every index, update the maximum reachable index from this point.
 * When you reach the end of the current jump range:
 * Increase your jump count.
 * Update the jump range to the furthest point you could reach so far.
 * Continue until the loop completes.
 * Return the total number of jumps needed to reach the last index.
*/

1class Solution {
2    public int jump(int[] nums) {
3        int nJump=0;
4        int currentEnd=0;
5        int farthest=0;
6        for (int i=0;i<nums.length-1;i++){
7            farthest=Math.max(farthest,nums[i]+i);
8            if(i==currentEnd){
9                nJump++;
10                currentEnd=farthest;
11            }
12        }
13        return nJump;
14    }
15}