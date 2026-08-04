// Last updated: 8/4/2026, 11:22:17 AM
1class Solution {
2    public boolean isPowerOfThree(int n) {
3        if(n==0) return false;
4        while(n>0){
5            if(n==1){
6                return true;
7            }
8            if(n%3!=0){
9                break;
10            }
11            n=n/3;
12        }
13        return false;
14    }
15}