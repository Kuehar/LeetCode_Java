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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        
        targetSum -= root.val;
        if(root.left == null && root.right == null){
            return targetSum == 0;
        }
        return hasPathSum(root.left,targetSum) || hasPathSum(root.right,targetSum);
    }
}
// Runtime: 1 ms, faster than 52.21% of Java online submissions for Path Sum.
// Memory Usage: 43.3 MB, less than 71.11% of Java online submissions for Path Sum.
