// Last updated: 8/11/2026, 10:57:13 AM
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
17    public boolean isMirror(TreeNode n1,TreeNode n2){
18        if(n1==null&&n2==null){
19            return true;
20        }
21        if(n1==null||n2==null){
22            return false;
23        }
24        return n1.val==n2.val&&isMirror(n1.left,n2.right)&&isMirror(n1.right,n2.left);
25    }
26    public boolean isSymmetric(TreeNode root) {
27        if(root==null){
28            return true;
29        }
30        boolean ans=isMirror(root.left,root.right);
31        return ans;
32
33    }
34}