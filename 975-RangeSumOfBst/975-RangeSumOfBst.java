// Last updated: 6/8/2025, 11:09:51 pm
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
    public int rangeSumBST(TreeNode root, int low, int high) {
        return sum(root,low,high);
    }

    public int sum(TreeNode root, int l, int h){
        if(root == null){
            return 0;
        }

        if(root.val>=l && root.val<=h){
            return root.val + sum(root.left,l,h) + sum(root.right,l,h);
        }
        else if(root.val > h){
            return sum(root.left,l,h);
        }
        else{
            return sum(root.right,l,h);
        }
    }
}