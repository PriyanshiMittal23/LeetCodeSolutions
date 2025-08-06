// Last updated: 6/8/2025, 11:09:45 pm
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
    public boolean flipEquiv(TreeNode r1, TreeNode r2) {
        if(r1==null && r2==null){
            return true;
        }
        if(r2==null || r1==null || r2.val!=r1.val){
            return false;
        }
        boolean flip= flipEquiv(r1.left,r2.right) && flipEquiv(r1.right,r2.left);
        boolean noflip= flipEquiv(r1.left,r2.left) && flipEquiv(r1.right,r2.right);
        return flip||noflip;
    }
}