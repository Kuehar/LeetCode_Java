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
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }else{
            int left_depth = maxDepth(root.left);
            int right_depth = maxDepth(root.right);
            return Math.max(left_depth,right_depth)+1;
        }
    }
}
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
// Memory Usage: 43.1 MB, less than 38.99% of Java online submissions for Maximum Depth of Binary Tree.
