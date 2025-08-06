// Last updated: 6/8/2025, 11:07:18 pm
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
    public int amountOfTime(TreeNode root, int start) {
        HashMap<Integer,List<Integer>>hm = new HashMap<>();
        traverse(root,hm,null);
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        q.add(start);
        visited.add(start);
        int ans=-1;
        while(!q.isEmpty()){
            int s = q.size();
            ans++;
            for(int i=0;i<s;i++){
                int rv = q.poll();

                for(int nbrs: hm.get(rv)){
                    if(!visited.contains(nbrs)){
                        q.add(nbrs);
                        visited.add(nbrs);
                    }
                }
            }
        }
        return ans;
    }

    public void traverse(TreeNode root,HashMap<Integer,List<Integer>>hm,TreeNode p){
        if(root==null){
            return;
        }
        if(!hm.containsKey(root.val)){
            hm.put(root.val, new ArrayList<>());
        }
        if(p!=null){
            hm.get(root.val).add(p.val);
            hm.get(p.val).add(root.val);
        }
        traverse(root.left,hm,root);
        traverse(root.right,hm,root);
    }
}