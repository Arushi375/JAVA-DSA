// Last updated: 11/25/2026, 9:58:10 AM
1class Solution {
2    public List<Integer> largestDivisibleSubset(int[] nums) {
3        int n=nums.length;
4        int []dp=new int [n];
5        int []hash=new int [n];
6        int lastIndex=0;
7        Arrays.sort(nums);
8        Arrays.fill(dp,1);
9        for(int i=0;i<n;i++){
10            hash[i]=i;
11        }
12        int max=0;
13        for(int index=0;index<n;index++){
14            for(int prev=0;prev<index;prev++){
15                if(nums[index]%nums[prev]==0&&dp[index]<dp[prev]+1){
16                    dp[index]=dp[prev]+1;
17                    hash[index]=prev;
18                }
19            }
20            if(dp[index]>max){
21                max=dp[index];
22                lastIndex=index;
23            }
24        }
25        List<Integer> temp=new ArrayList<>();
26        while(hash[lastIndex]!=lastIndex){
27            temp.add(nums[lastIndex]);
28            lastIndex=hash[lastIndex];
29        }
30        temp.add(nums[lastIndex]);
31        return temp;
32
33    }
34}