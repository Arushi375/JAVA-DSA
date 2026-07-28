// Last updated: 7/28/2026, 5:10:48 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ls=new ArrayList<> ();
        postOrder(root,ls);
        return ls;
    }
    public void postOrder(TreeNode root, List<Integer> list)
    {
        if(root==null){return ;}
        postOrder(root.left,list);
        postOrder(root.right,list);
        list.add(root.val);
    }
}