// Last updated: 6/8/2025, 11:13:49 pm
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
    public boolean isBalanced(TreeNode root) {
        return Balanced(root).isBalanced;
    }

    public balancePair Balanced(TreeNode root){
        if(root==null){
            return new balancePair();
        }
        balancePair left = Balanced(root.left);
        balancePair right = Balanced(root.right);
        balancePair p = new balancePair();
        p.ht = Math.max(left.ht,right.ht)+1;
        if(left.isBalanced && right.isBalanced && Math.abs(left.ht-right.ht)<=1){
            p.isBalanced=true;
        }
        else{
            p.isBalanced=false;
        }
        return p;
    }

    public class balancePair{
        int ht=-1;
        boolean isBalanced=true;
    }
}