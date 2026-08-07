// Last updated: 8/7/2026, 10:35:55 AM
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
17    public int maxDepth(TreeNode root) {
18        if(root==null){
19            return 0;
20        }
21        int depth=0;
22        List<List<Integer>> ls=new ArrayList<>();
23        Queue <TreeNode> q=new LinkedList<>();
24        TreeNode temp=root;
25        q.offer(temp);
26        while(!q.isEmpty()){
27            int size=q.size();
28            List <Integer> level=new ArrayList<>();
29            for(int i=0;i<size;i++ ){
30                TreeNode curr=q.poll();
31                level.add(curr.val);
32                if(curr.left!=null){
33                    q.offer(curr.left);
34                }
35                if(curr.right!=null){
36                    q.offer(curr.right);
37                }
38            }
39            ls.add(level);
40        }
41        return ls.size();
42        
43    }
44}