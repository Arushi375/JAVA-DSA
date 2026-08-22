// Last updated: 8/22/2026, 10:01:34 AM
1class Solution {
2    public int candy(int[] ratings) {
3        int sum=1;
4        int down,peak;
5        int i=1;
6        int n=ratings.length;
7        while(i<ratings.length){
8            if(ratings[i]==ratings[i-1]){
9                sum=sum+1;
10                i++;
11                continue;
12            }
13            peak=1;
14            while(i<n&&ratings[i]>ratings[i-1]){
15                peak+=1;
16                sum+=peak;
17                i++;
18            }
19            down=1;
20            while(i<n&&ratings[i]<ratings[i-1]){
21                sum+=down;
22                i++;
23                down++;
24            }
25            if(peak<down){
26                sum=sum+(down-peak);
27            }
28        }
29        return sum;
30    }
31}