// Last updated: 6/8/2025, 11:13:50 pm
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return construct(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

	public TreeNode construct(int[] pre,int plo,int phi, int[] in, int ilo, int ihi) {
        if(ilo>ihi || plo>phi){
            return null;
        }
		TreeNode nn = new TreeNode();
        nn.val=pre[plo];
        int i=search(in,ilo,ihi,pre[plo]);
        int nel=i-ilo;
        nn.left=construct(pre,plo+1,plo+nel,in,ilo,i-1);
        nn.right=construct(pre,plo+nel+1,phi,in,i+1,ihi);
        return nn;
	}

    public int search(int[]in,int si,int ei,int key){
        for(int i=si;i<=ei;i++){
            if(in[i]==key){
                return i;
            }
        }
        return -1;
    }
}