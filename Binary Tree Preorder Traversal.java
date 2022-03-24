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
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> ans = new LinkedList<>();
        if(root == null){
            return ans;
        }
        
        stack.add(root);
        
        while(!stack.isEmpty()){
            // polllast -- この両端キューの最後の要素を取得および削除します。両端キューが空の場合は null を返します。
            TreeNode node = stack.pollLast();
            ans.add(node.val);
            
            if(node.right != null){
                stack.add(node.right);
            }
            
            if(node.left != null){
                stack.add(node.left);
            }
        }
        return ans;
    }
}

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
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> ans = new LinkedList<>();
        if(root != null){
            ans.add(root.val);
            ans.addAll(preorderTraversal(root.left));
            ans.addAll(preorderTraversal(root.right));
        }
        return ans;
    }
}
