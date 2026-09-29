// Last updated: 9/29/2026, 8:59:30 AM
1class Solution {
2    public int integerBreak(int n) {
3        int index=n;
4        if(n==2){return 1;}
5        if (n == 3) return 2;
6        return func(index,n);
7    }
8    private int func(int index,int n){
9        if(index==0){
10            return n;
11        }
12        int notTake=1*func(index-1,n);
13        int take=Integer.MIN_VALUE;
14        int number=index+1;
15        if(number<=n){
16            take=index*func(index,n-index);
17        }
18        return Math.max(notTake,take);
19    }
20}