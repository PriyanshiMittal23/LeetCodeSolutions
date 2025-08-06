// Last updated: 6/8/2025, 11:13:18 pm
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
        l=new ArrayList<>();
        post(root);
        return l;
        
    }
    List<Integer>l;
    public void post(TreeNode root){
        if(root==null){
            return;
        }
        post(root.left);
        post(root.right);
        l.add(root.val);
    }
}