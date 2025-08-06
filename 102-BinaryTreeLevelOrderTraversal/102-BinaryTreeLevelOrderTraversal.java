// Last updated: 6/8/2025, 11:13:55 pm
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        Queue<TreeNode>q2=new LinkedList<>();
        List<Integer>l=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        q.add(root);
        while(!q.isEmpty()){
            TreeNode nn=q.remove();
            l.add(nn.val);
            if(nn.left!=null){
                q2.add(nn.left);
            }
            if(nn.right!=null){
                q2.add(nn.right);
            }
            if(q.isEmpty()){
                q=q2;
                q2=new LinkedList<TreeNode>();
                ans.add(l);
                l=new ArrayList<Integer>();
            }
        }
        return ans;
    }
}