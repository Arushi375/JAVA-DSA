// Last updated: 8/5/2026, 11:08:17 PM
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
17    public TreeNode searchBST(TreeNode root, int val) {
18        TreeNode temp=root;
19        while(temp!=null){
20            if(temp.val==val){
21                return temp;
22            }
23            if(temp.val>val){
24                temp=temp.left;
25            }
26            else if(temp.val<val){
27                temp=temp.right;
28            }
29        }
30        return null;
31    }
32}