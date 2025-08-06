// Last updated: 6/8/2025, 11:13:19 pm
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
        l=new ArrayList<>();
        pre(root);
        return l;
    }
    List<Integer>l;
    public void pre(TreeNode root){
        if(root==null){
            return;
        }
        l.add(root.val);
        pre(root.left);
        pre(root.right);
    }
}