// Last updated: 8/19/2026, 3:15:08 PM
1class Solution {
2    public boolean canJump(int[] nums) {
3       int maxJump=0;
4       for(int i=0;i<nums.length;i++){
5        if(maxJump<i){
6            return false;
7        }
8        maxJump=Math.max(maxJump,nums[i]+i);
9        
10       }
11       return true;
12    }
13}