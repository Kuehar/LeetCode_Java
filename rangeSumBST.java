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
    int ans = 0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        dfs(root,L,R);
        return ans;
        
    }
    
    public void dfs(TreeNode root,int L,int R){
        if(root != null){
            if(L <= root.val && root.val <= R){
                ans += root.val;
            }
            
            if(L < root.val){
                dfs(root.left,L,R);
            }
            
            if(root.val < R){
                dfs(root.right,L,R);
            }
        }
    }
}
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Range Sum of BST.
// Memory Usage: 49.4 MB, less than 87.90% of Java online submissions for Range Sum of BST.
