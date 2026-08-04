// Last updated: 8/4/2026, 11:24:36 AM
1class Solution {
2    public boolean isPowerOfFour(int n) {
3        if(n==0){return false;}
4        while(n>0){
5            if(n==1){ return true;}
6            if(n%4!=0){ break ;}
7            n=n/4;
8        }
9        return false;
10    }
11}