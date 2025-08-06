// Last updated: 6/8/2025, 11:13:36 pm
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
    public int maxPathSum(TreeNode root) {
        pathSum(root);
        return ans;
    }
    int ans=Integer.MIN_VALUE;
    public int pathSum(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=Math.max(pathSum(root.left),0);
        int right=Math.max(pathSum(root.right),0);
        ans=Math.max(ans,root.val+left+right);
        return root.val+Math.max(left,right);
    }
}