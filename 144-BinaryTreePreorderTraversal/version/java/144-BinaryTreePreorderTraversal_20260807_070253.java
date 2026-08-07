// Last updated: 8/7/2026, 7:02:53 AM
/*
 * nitialize an empty vector 'preorder' to store the preorder traversal result. Also, create a stack to help with the traversal, and push the root node onto the stack. If the root is null, return an empty traversal result, as there are no nodes to traverse.
 * Begin by pushing the root of the binary tree onto the stack.
 * While the stack is not empty, repeat the following:
 * Get the current node from the top of the stack.
 * Remove the node from the stack.
 * Add the node's value to the preorder result vector.
 * If the current node has a right child, push it onto the stack.
 * If the current node has a left child, push it onto the stack as well. This ensures that the left child is processed first, following the preorder traversal rules.
 * After completing the traversal, return the 'preorder' vector containing the traversal result.
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
17    public List<Integer> preorderTraversal(TreeNode root) {
18        List<Integer> ls=new ArrayList<>();
19        Stack <TreeNode> stack=new Stack<>();
20        TreeNode temp=root;
21        while(true){
22            if(temp!=null){
23                ls.add(temp.val);
24                stack.push(temp);
25                temp=temp.left;
26            }
27            else{
28                if(stack.isEmpty()){
29                    break;
30                }
31                temp=stack.pop();
32                temp=temp.right;
33            }
34        }
35        return ls;
36    }
37}