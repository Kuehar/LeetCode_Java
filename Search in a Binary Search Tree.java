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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null || val == root.val) return root;
        return val < root.val ? searchBST(root.left,val): searchBST(root.right,val);
    }
}
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in a Binary Search Tree.
// Memory Usage: 52.1 MB, less than 11.19% of Java online submissions for Search in a Binary Search Tree.
