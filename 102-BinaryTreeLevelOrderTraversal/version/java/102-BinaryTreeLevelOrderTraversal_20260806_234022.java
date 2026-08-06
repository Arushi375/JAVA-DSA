// Last updated: 8/6/2026, 11:40:22 PM
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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        List<List<Integer>> ans=new ArrayList<>();
19        if(root==null){
20            return ans;
21        }
22        Queue<TreeNode> q=new LinkedList<>();
23        q.offer(root);
24        while(!q.isEmpty())
25        {
26            int size=q.size();
27            List<Integer> level=new ArrayList<>();
28            for(int i=0;i<size;i++){
29                TreeNode curr=q.poll();
30                level.add(curr.val);
31                if(curr.left!=null){
32                    q.offer(curr.left);
33                }
34                if(curr.right!=null){
35                    q.offer(curr.right);
36                }
37            }
38            ans.add(level);
39        }
40        return ans;
41    }
42}