// Last updated: 6/8/2025, 11:12:50 pm
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
    int maxD;
    public List<Integer> rightSideView(TreeNode root) {
        maxD=-1;
        List<Integer>l=new ArrayList<>();
        rSV(root,l,0);
        return l;
    }

    public void rSV(TreeNode root,List<Integer>l,int currlvl){
        if(root==null){
            return;
        }
        if(currlvl>maxD){
            l.add(root.val);
            maxD=currlvl;
        }
        rSV(root.right,l,currlvl+1);
        rSV(root.left,l,currlvl+1);


    }
    
}