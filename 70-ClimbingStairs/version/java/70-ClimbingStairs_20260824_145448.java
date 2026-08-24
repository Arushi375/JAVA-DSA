// Last updated: 8/24/2026, 2:54:48 PM
/*
 * Sure. The simplest way to think about **Min Cost Climbing Stairs** is:
 * 
 * ### 1. Define `dp[i]`
 * 
 * ```text
 * dp[i] = minimum cost needed to reach the top if I start from stair i
 * ```
 * 
 * ### 2. From stair `i`, I have 2 choices
 * 
 * I can move:
 * 
 * ```text
 * i → i + 1
 * ```
 * 
 * or
 * 
 * ```text
 * i → i + 2
 * ```
 * 
 * So I choose whichever is cheaper:
 * 
 * ```text
 * dp[i] = cost[i] + min(dp[i+1], dp[i+2])
 * ```
 * 
 * ### 3. Why go backwards?
 * 
 * `dp[i]` depends on:
 * 
 * ```text
 * dp[i+1] and dp[i+2]
 * ```
 * 
 * So those values must already be calculated.
 * 
 * Therefore:
 * 
 * ```text
 * n-1 → n-2 → n-3 → ... → 0
 * ```
 * 
 * ### 4. Why `dp[n] = 0`?
 * 
 * `n` represents the **top**. Once we reach the top, there is no additional cost.
 * 
 * ### 5. Why `min(dp[0], dp[1])`?
 * 
 * You are allowed to start from either stair `0` or stair `1`.
 * 
 * So:
 * 
 * ```text
 * answer = min(
 *     cost starting from 0,
 *     cost starting from 1
 * )
 * ```
 * 
 * ### The entire idea in one line:
 * 
 * > **For every stair, calculate the cost of taking the cheaper of the two possible next steps, working backwards from the top.**
 * 
 * This is a classic **1D DP with backward traversal**.
*/

1class Solution {
2    public int minCostClimbingStairs(int[] cost) {
3        int dp[]=new int[cost.length+2];
4        dp[cost.length]=0;
5
6        for(int i=cost.length-1;i>=0;i--){
7            dp[i] = cost[i] + Math.min(dp[i + 1], dp[i + 2]);
8        }
9        return Math.min(dp[0],dp[1]);
10    }
11}