// Last updated: 8/27/2026, 3:24:33 PM
/*
 * ### House Robber II — Approach
 * 
 * The main difficulty is that the houses are arranged in a **circle**, so the **first and last houses are adjacent**. Therefore, we cannot rob both.
 * 
 * So we divide the problem into **2 cases**:
 * 
 * 1. **Exclude the last house**
 * 
 *    * Consider houses from `0` to `n-2`.
 *    * Use the normal House Robber DP.
 * 
 * 2. **Exclude the first house**
 * 
 *    * Consider houses from `1` to `n-1`.
 *    * Again, use the normal House Robber DP.
 * 
 * Then take the maximum of the two cases.
 * 
 * ### DP logic
 * 
 * For each house `i`:
 * 
 * * **Skip it:** `dp[i-1]`
 * * **Rob it:** `dp[i-2] + nums[i]`
 * 
 * Therefore:
 * 
 * ```java
 * dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
 * ```
 * 
 * ### Overall idea
 * 
 * ```text
 *           Circular Houses
 *                 |
 *        First & last conflict
 *                 |
 *         ┌───────┴───────┐
 *         ↓               ↓
 *    Exclude last    Exclude first
 *    [0 ... n-2]     [1 ... n-1]
 *         ↓               ↓
 *     Normal DP        Normal DP
 *         └───────┬───────┘
 *                 ↓
 *               max
 * ```
 * 
 * **Time:** `O(n)`
 * **Space:** `O(n)` with your two DP arrays.
 * 
 * The key thing to remember is: **convert the circular problem into two linear House Robber problems.**
*/

1class Solution {
2    public int rob(int[] nums) {
3        int dp1[]=new int [nums.length];
4        int dp2[]=new int [nums.length];
5        if(nums.length==1)return nums[0];
6        if (nums.length == 2) return Math.max(nums[0], nums[1]);
7        dp1[0]=nums[0];
8        dp1[1]=Math.max(nums[0],nums[1]);
9       
10        for(int i=2;i<nums.length-1;i++)
11        {
12            dp1[i]=Math.max(dp1[i-1],dp1[i-2]+nums[i]);
13        }
14        dp2[1]=nums[1];
15        dp2[2]=Math.max(nums[1],nums[2]);
16        for(int i=3;i<nums.length;i++)
17        {
18            dp2[i]=Math.max(dp2[i-1],dp2[i-2]+nums[i]);
19        }
20        return Math.max(dp1[nums.length-2],dp2[nums.length-1]);
21    }
22}