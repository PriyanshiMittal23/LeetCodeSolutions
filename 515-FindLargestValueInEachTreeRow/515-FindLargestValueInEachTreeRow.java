// Last updated: 6/8/2025, 11:11:04 pm
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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        Queue<TreeNode>q2=new LinkedList<>();
        if(root==null){
            return l;
        }
        int ans=Integer.MIN_VALUE;
        q.add(root);
        while(!q.isEmpty()){
            TreeNode rv=q.remove();
            if(rv.left!=null){
                q2.add(rv.left);
            }
            if(rv.right!=null){
                q2.add(rv.right);
            }
            ans=Math.max(rv.val,ans);
            if(q.isEmpty()){
                l.add(ans);
                ans=Integer.MIN_VALUE;
                q=q2;
                q2=new LinkedList<TreeNode>();

            }
        }
        return l;
    }
}