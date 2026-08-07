// Last updated: 8/7/2026, 6:52:20 AM
/*
 * nitialize an empty stack and set the current node to the root of the binary tree.
 * Enter a loop that continues as long as there are nodes in the stack or the current node is not null.
 * If the current node is not null, push it onto the stack and move to its left child. Continue this process until a node with no left child is reached.
 * Once a null node is encountered, pop the top node from the stack, process it (e.g., add its value to the result array), and move to its right child.
 * Repeat this process of pushing and popping nodes, alternating between moving left and right, until the stack is empty and the current node is null.
 * At the end of the process, return the result array, which will contain the inorder traversal of the binary tree.
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
17    //iterative solution
18    public List<Integer> inorderTraversal(TreeNode root) {
19        List <Integer> ls=new ArrayList<>();
20        Stack <TreeNode> stack=new Stack<TreeNode>();
21        TreeNode temp=root;
22        while(true){
23            if(temp!=null){
24                stack.push(temp);
25                temp=temp.left;
26            }
27            else{
28                if(stack.isEmpty()){
29                    break;
30                }
31                temp=stack.pop();
32                ls.add(temp.val);
33                temp=temp.right;
34            }
35        }
36        return ls;
37    }
38}