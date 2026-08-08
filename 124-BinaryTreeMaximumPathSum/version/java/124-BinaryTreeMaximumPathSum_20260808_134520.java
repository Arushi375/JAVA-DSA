// Last updated: 8/8/2026, 1:45:20 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    int sum=Integer.MIN_VALUE;
18    public int calculateSum(TreeNode root){
19        if(root==null){
20            return 0;
21        }
22        int lSum=Math.max(0,calculateSum(root.left));
23        int rSum=Math.max(0,calculateSum(root.right));
24        sum=Math.max(sum,lSum+rSum+root.val);
25        return root.val+Math.max(lSum,rSum);
26    }
27    public int maxPathSum(TreeNode root) {
28        calculateSum(root);
29        return sum;
30    }
31}