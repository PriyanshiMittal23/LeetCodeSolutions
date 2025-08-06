// Last updated: 6/8/2025, 11:13:59 pm
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
    public boolean isValidBST(TreeNode root) {
        return ValidBST(root).validbst;
    }
    public BSTpair ValidBST(TreeNode root){
        if(root==null){
            return new BSTpair();
        }
        BSTpair lbp = ValidBST(root.left);
        BSTpair rbp = ValidBST(root.right);
        BSTpair sbp = new BSTpair();
        sbp.min = Math.min(lbp.min, Math.min(rbp.min,root.val));
        sbp.max = Math.max(lbp.max,Math.max(rbp.max,root.val));
        if(lbp.validbst && rbp.validbst && root.val>lbp.max && root.val<rbp.min){
            sbp.validbst = true;
        }else{
            sbp.validbst = false;
        }
        return sbp;
    }
    class BSTpair{
        boolean validbst=true;
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;


    }
}