// Last updated: 7/28/2026, 5:10:52 PM
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int dfs(struct TreeNode* root, int currentSum) {
    if (root == NULL)
        return 0;

    // Form the number so far
    currentSum = currentSum * 10 + root->val;

    // If leaf node, return the number
    if (root->left == NULL && root->right == NULL)
        return currentSum;

    // Recurse left and right
    return dfs(root->left, currentSum) + dfs(root->right, currentSum);
}

int sumNumbers(struct TreeNode* root) {
    return dfs(root, 0);
}
