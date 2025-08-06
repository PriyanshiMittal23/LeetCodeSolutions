// Last updated: 6/8/2025, 11:13:52 pm
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return create(nums,0,nums.length-1);
    }
    public TreeNode create(int[]nums,int si,int ei){
        if(ei<si){
            return null;
        }
        int mid=(si+ei)/2;
        TreeNode nn=new TreeNode();
        nn.val=nums[mid];
        nn.left=create(nums,si,mid-1);
        nn.right=create(nums,mid+1,ei);
        return nn;
    }
}