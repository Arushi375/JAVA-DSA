// Last updated: 8/27/2026, 4:45:42 PM
/*
 * You're solving **LeetCode 91 — Decode Ways**, but the DP logic here is different from House Robber. Your current recurrence:
 * 
 * ```java
 * dp[i] = Math.max(dp[i-1], dp[i-2]) + 1;
 * ```
 * 
 * doesn't work because we're **counting valid decodings**, not choosing the maximum.
 * 
 * ### Main approach
 * 
 * Think about the **last character(s)** of the string.
 * 
 * For every position `i`, we have two possible ways to decode:
 * 
 * 1. **Take one digit**
 * 
 *    * If `s[i]` is not `'0'`, it can be decoded individually.
 *    * So we add `dp[i-1]`.
 * 
 * 2. **Take two digits**
 * 
 *    * If the two-digit number is between `10` and `26`, it is valid.
 *    * So we add `dp[i-2]`.
 * 
 * Therefore:
 * 
 * ```java
 * dp[i] = 0;
 * 
 * if (one digit is valid)
 *     dp[i] += dp[i-1];
 * 
 * if (two digits are valid)
 *     dp[i] += dp[i-2];
 * ```
 * 
 * ### What does `dp[i]` mean?
 * 
 * Use:
 * 
 * ```text
 * dp[i] = number of ways to decode the first i characters
 * ```
 * 
 * For example:
 * 
 * ```text
 * s = "226"
 * ```
 * 
 * We start with:
 * 
 * ```text
 * dp[0] = 1
 * dp[1] = 1
 * ```
 * 
 * Why `dp[0] = 1`?
 * 
 * There is **one way to decode an empty string** — choose nothing. This gives us a base case that makes the recurrence work.
 * 
 * Then:
 * 
 * ```text
 * "2"   → 1 way
 * "22"  → 2 ways
 * "226" → 3 ways
 * ```
 * 
 * The three decodings are:
 * 
 * ```text
 * 2 2 6
 * 22 6
 * 2 26
 * ```
 * 
 * ### Your code should look like this
 * 
 * ```java
 * class Solution {
 *     public int numDecodings(String s) {
 * 
 *         int n = s.length();
 *         int dp[] = new int[n + 1];
 * 
 *         if (s.charAt(0) == '0') {
 *             return 0;
 *         }
 * 
 *         dp[0] = 1;
 *         dp[1] = 1;
 * 
 *         for (int i = 2; i <= n; i++) {
 * 
 *             // Take one digit
 *             if (s.charAt(i - 1) != '0') {
 *                 dp[i] += dp[i - 1];
 *             }
 * 
 *             // Take two digits
 *             int num = Integer.parseInt(s.substring(i - 2, i));
 * 
 *             if (num >= 10 && num <= 26) {
 *                 dp[i] += dp[i - 2];
 *             }
 *         }
 * 
 *         return dp[n];
 *     }
 * }
 * ```
 * 
 * ### 🧠 The DP pattern
 * 
 * This one is slightly different from the problems you've done before:
 * 
 * **Climbing Stairs:**
 * 
 * ```text
 * dp[i] = dp[i-1] + dp[i-2]
 * ```
 * 
 * because both jumps are always valid.
 * 
 * **House Robber:**
 * 
 * ```text
 * dp[i] = max(skip, rob)
 * ```
 * 
 * because we're choosing the better option.
 * 
 * **Decode Ways:**
 * 
 * ```text
 * dp[i] = valid_one_digit + valid_two_digits
 * ```
 * 
 * because we're **counting all valid possibilities**.
 * 
 * So the important question to ask in DP is:
 * 
 * > **Am I counting ways, minimizing something, or maximizing something?**
 * 
 * Here, we're **counting ways**.
*/

1class Solution {
2    public int numDecodings(String s) {
3        int dp[]=new int[s.length()+1];
4        if (s.charAt(0)=='0'){
5            return 0;
6        }
7        dp[0]=1;
8        dp[1]=1;
9        for(int i=2;i<=s.length();i++){
10           if (s.charAt(i - 1) != '0') {
11                dp[i] += dp[i - 1];
12            }
13
14            // Take two digits
15            int num = Integer.parseInt(s.substring(i - 2, i));
16
17            if (num >= 10 && num <= 26) {
18                dp[i] += dp[i - 2];
19            }
20        }
21        return dp[s.length()];
22
23    }
24}