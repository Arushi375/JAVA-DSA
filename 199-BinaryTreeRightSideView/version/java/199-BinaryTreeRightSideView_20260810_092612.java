// Last updated: 8/10/2026, 9:26:12 AM
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
17    public void preOrder(List<Integer> ans,TreeNode root,int level){
18        if(root==null){
19            return;
20        }
21        if(level==ans.size()){
22            ans.add(root.val);
23        }
24        preOrder(ans,root.right,level+1);
25        preOrder(ans,root.left,level+1);
26    }
27
28    public List<Integer> rightSideView(TreeNode root) {
29        List<Integer> ans=new ArrayList<>();
30        preOrder(ans,root,0);
31        return ans;
32    }
33}