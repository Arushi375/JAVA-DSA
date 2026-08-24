// Last updated: 8/24/2026, 2:30:52 PM
/*
 * The Fibonacci sequence is defined as F(n) = F(n-1) + F(n-2) with base cases F(0)=1 and F(1)=1. A naive recursive solution recalculates many subproblems, leading to exponential time. By storing results in a DP array, we avoid recomputation and compute the result efficiently.
 * 
 * Approach:
 * 
 * Initialize a DP array dp of size n+1 with -1 to store results.
 * Set the base cases: dp[0] = 1, dp[1] = 1.
 * Iterate from i = 2 to n and compute dp[i] = dp[i-1] + dp[i-2].
 * Return dp[n] as the answer.
 * 
 * same as fibonacci
*/

1class Solution {
2    public int climbStairs(int n) {
3        if(n==0) return 1;
4        if(n==1) return 1;
5        int prev,prev2,curr=0;
6        prev=1;
7        prev2=1;
8        for(int i=2;i<=n;i++){
9            curr=prev2+prev;
10            prev2=prev;
11            prev=curr;
12        }
13        return prev;
14
15
16    }
17}