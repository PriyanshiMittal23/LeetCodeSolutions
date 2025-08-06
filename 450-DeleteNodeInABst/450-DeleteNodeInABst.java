// Last updated: 6/8/2025, 11:11:20 pm
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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        if(root.val>key){
            root.left=deleteNode(root.left,key);
        }
        else if(root.val<key){
            root.right=deleteNode(root.right,key);
        }
        else{
            if(root.right==null){
                return root.left;
            }
            else if(root.left==null){
                return root.right;
            }
            else{
                int lmax=maxTreeNode(root.left);
                root.left=deleteNode(root.left,lmax);
                root.val=lmax;
            }
        }
        return root;

    }
    public int maxTreeNode(TreeNode root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int r = maxTreeNode(root.right);
        return Math.max(root.val,r);
    }
}