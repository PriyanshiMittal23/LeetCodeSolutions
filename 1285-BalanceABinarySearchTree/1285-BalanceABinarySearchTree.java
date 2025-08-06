// Last updated: 6/8/2025, 11:09:20 pm
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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer>l = new ArrayList<>();
        inorder(root,l);
        return build(l,0,l.size()-1);
    }

    public List<Integer> inorder(TreeNode root, List<Integer>l){
        if(root==null){
            return l;
        }

        inorder(root.left,l);
        l.add(root.val);
        inorder(root.right,l);
        return l;
    }

    public TreeNode build(List<Integer>l, int st, int end){
        if(st>end){
            return null;
        }

        int mid = (st+end)/2;
        TreeNode nn = new TreeNode(l.get(mid));
        nn.left = build(l,st,mid-1);
        nn.right = build(l,mid+1,end);
        return nn;
    }
}