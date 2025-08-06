// Last updated: 6/8/2025, 11:13:47 pm
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
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }

        int a = minDepth(root.left)+1;
        int b = minDepth(root.right)+1;
        return (a==1 || b==1)? a+b-1: Math.min(a,b);
    }
}