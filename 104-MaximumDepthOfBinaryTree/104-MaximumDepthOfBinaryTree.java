// Last updated: 6/8/2025, 11:13:53 pm
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
    public int maxDepth(TreeNode root) {
        return heightm(root);
    }
		public int heightm(TreeNode root){
			if(root==null){
				return 0;
			}
			int left=heightm(root.left);
			int right=heightm(root.right);
			int height=Math.max(left,right)+1;
			return height;
		}
}