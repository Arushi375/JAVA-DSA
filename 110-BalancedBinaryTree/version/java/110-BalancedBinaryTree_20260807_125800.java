// Last updated: 8/7/2026, 12:58:00 PM
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
17    public boolean isBalanced(TreeNode root) {
18        return dfsHeight(root)!=-1;
19    }
20    public int dfsHeight(TreeNode root){
21        if(root==null)
22        {
23            return 0;
24        }
25        int leftHeight=dfsHeight(root.left);
26        if(leftHeight==-1){
27            return -1;
28        }
29        int rightHeight=dfsHeight(root.right);
30        if(rightHeight==-1){
31            return -1;
32        }
33        if(Math.abs(leftHeight-rightHeight)>1)
34        {
35            return -1;
36        }
37        return Math.max(leftHeight, rightHeight) + 1;
38    }
39}