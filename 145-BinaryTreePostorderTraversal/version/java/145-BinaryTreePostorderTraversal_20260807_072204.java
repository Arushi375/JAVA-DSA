// Last updated: 8/7/2026, 7:22:04 AM
/*
 * Create two stacks: one for holding nodes and another for storing the final postorder traversal sequence. Initialize an array `postorder` to store the traversal sequence.
 * Push the root node to the first stack.
 * Process the nodes until the first stack is empty:
 * Pop a node from the top of the first stack.
 * Push this node onto the second stack.
 * Push its left child (if it exists) onto the first stack.
 * Push its right child (if it exists) onto the first stack.
 * Once the first stack is empty, retrieve the nodes in the postorder sequence by popping nodes from the second stack one by one and store them in the postorder array.
*/

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
17    public List<Integer> postorderTraversal(TreeNode root) {
18        
19        List <Integer> ls=new ArrayList<>();
20        if(root==null){
21            return ls;
22        }
23        Stack <TreeNode> s1=new Stack<>();
24        Stack <TreeNode> s2=new Stack<>();
25        s1.push(root);
26        TreeNode temp=root;
27        while(!s1.isEmpty()){
28            temp=s1.pop();
29            s2.push(temp);
30            if(temp.left!=null){
31                s1.push(temp.left);
32            }
33            if(temp.right!=null){
34                s1.push(temp.right);
35            }
36        }
37        while(!s2.isEmpty()){
38            ls.add(s2.pop().val);
39        }
40        return ls;
41    }
42}