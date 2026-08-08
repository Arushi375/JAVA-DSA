// Last updated: 8/8/2026, 1:34:33 PM
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
17    int diameter=0;
18    public int calculateHeight(TreeNode root){
19        if(root==null){
20            return 0;
21        }
22        int lheight=calculateHeight(root.left);
23        int rheight=calculateHeight(root.right);
24        diameter=Math.max(diameter,lheight+rheight);
25        return 1+Math.max(lheight,rheight);
26
27    }
28    public int diameterOfBinaryTree(TreeNode root) {
29        calculateHeight(root);
30        return diameter;
31    }
32}