// Last updated: 7/1/2026, 11:22:16 pm
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    long ans = 0;
18    long total = 0;
19    long sub;
20    public int maxProduct(TreeNode root) {
21        total = sumSubTree(root);
22        sumSubTree(root);
23        return (int)(ans%1000000007);
24    }
25
26    public long sumSubTree(TreeNode root){
27        if(root == null){
28            return 0;
29        }
30
31        sub = root.val + sumSubTree(root.left) + sumSubTree(root.right);
32        ans = Math.max(ans, sub*(total-sub));
33        return sub;
34    }
35}