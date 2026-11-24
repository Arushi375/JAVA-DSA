// Last updated: 11/24/2026, 11:41:03 PM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int sum=0;
4        for(int i=0;i<k;i++){
5            sum+=nums[i];
6        }
7        int max=sum;
8        int left=0,right=k-1;
9        while(right<nums.length-1){
10            sum-=nums[left];
11            left++;
12            right++;
13            sum+=nums[right];
14            max=Math.max(sum,max);
15        }
16        return max*1.0/k;
17    }
18}