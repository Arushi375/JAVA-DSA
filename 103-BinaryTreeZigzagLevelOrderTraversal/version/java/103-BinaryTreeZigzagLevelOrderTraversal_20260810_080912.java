// Last updated: 8/10/2026, 8:09:12 AM
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
17    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
18        List<List<Integer>> ans=new ArrayList<>();
19        TreeNode temp=root;
20        if(root==null){
21            return ans;
22        }
23        Queue <TreeNode> q=new LinkedList<>();
24        q.offer(temp);
25        boolean flag=false;
26        while(!q.isEmpty()){
27            int size=q.size();
28            List <Integer> level=new ArrayList<>();
29            for(int i=0;i<size;i++){
30                TreeNode curr=q.poll();
31                if(flag==false){
32                    level.add(curr.val);
33                }
34                else{
35                    level.add(0,curr.val);
36                }
37                if(curr.left!=null){
38                        q.offer(curr.left);
39                    }
40                if(curr.right!=null){
41                        q.offer(curr.right);
42                    }     
43                }
44            ans.add(level);
45            flag=!flag;
46        }
47        return ans;
48    }
49}