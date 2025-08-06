// Last updated: 6/8/2025, 11:08:49 pm
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
    public int pseudoPalindromicPaths (TreeNode root) {
        int[] arr = new int[10];
        return pPP(root,arr);
    }
    public static int pPP(TreeNode root, int[]arr){
        if(root==null){
            return 0;
        }
        arr[root.val]++;
        if(root.left == null && root.right==null){
            if(count(arr)){
                arr[root.val]--;
                return 1;
            }
            
        }
        
        int a = pPP(root.left,arr);
        int b = pPP(root.right,arr);
        arr[root.val]--;
        return a+b;
    }
    public static boolean count(int[]arr){
        int c=0;
        for(int i : arr){
            if(i%2!=0){
                c++;
            }
            if(c>1){
                return false;
            }
        }
        return true;
    }
}