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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(root,ans);
        return ans;
    }
    
    public void helper(TreeNode root,List<Integer> ans){
        if(root != null){
            ans.add(root.val);
            helper(root.left,ans);
            helper(root.right,ans);
        }
    }
}
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Preorder Traversal.
// Memory Usage: 40.2 MB, less than 46.95% of Java online submissions for Binary Tree Preorder Traversal.
