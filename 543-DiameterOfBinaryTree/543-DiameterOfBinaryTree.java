// Last updated: 6/8/2025, 11:11:00 pm
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
    public int diameterOfBinaryTree(TreeNode root) {
        return dbt(root).dia;
    }

    public Diapair dbt(TreeNode root){
        if(root == null){
            return new Diapair();
        }

        Diapair ldp = dbt(root.left);
        Diapair rdp = dbt(root.right);
        Diapair sdp = new Diapair();
        int s = ldp.ht+rdp.ht+2;
        sdp.dia = Math.max(s, Math.max(ldp.dia,rdp.dia));
        sdp.ht = Math.max(ldp.ht,rdp.ht)+1;
        return sdp;
    }

    public class Diapair{
        int ht=-1;
        int dia=0;
    }
}