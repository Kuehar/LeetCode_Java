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
        List<Integer> ans = new ArrayList<>();
        helper(root,ans);
        return ans;
    }
    
    private void helper(TreeNode root,List<Integer> ans){
        if(root != null){
            helper(root.left,ans);
            helper(root.right,ans);
            ans.add(root.val);
        }
    }
}
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Postorder Traversal.
// Memory Usage: 42.3 MB, less than 20.18% of Java online submissions for Binary Tree Postorder Traversal.
