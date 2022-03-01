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

// Recursive solution.
// Time Complexity: O(N), where N is the number of nodes in the tree.
// Space Complexity: O(N)
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
    int ans=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        dfs(root,low,high);
        return ans;
    }
    public void dfs(TreeNode root, int low, int high){
        if(root != null){
            if(low <= root.val && root.val <= high) ans+= root.val;
            if(low < root.val) dfs(root.left,low,high);
            if(root.val < high) dfs(root.right,low,high);
        }
    }
}
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Range Sum of BST.
// Memory Usage: 67.9 MB, less than 7.83% of Java online submissions for Range Sum of BST.

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
// Iterative solution.
// Time Complexity: O(N), where N is the number of nodes in the tree.
// Space Complexity: O(N)
class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        int ans = 0;
        Stack<TreeNode> stack = new Stack();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node != null){
                if(L <= node.val && node.val <= R){
                    ans += node.val;
                }
                
                if(L < node.val){
                    stack.push(node.left);
                }
                if(node.val < R){
                    stack.push(node.right);
                }
            }
        }
        return ans;
    }
}
