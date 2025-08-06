// Last updated: 6/8/2025, 11:10:06 pm
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    HashMap<Integer,List<Integer>> hm = new HashMap<>();
		public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
			List<Integer>ll=new ArrayList<>();
			graph(root,hm);
			BFS(target.val,k,ll);
			return ll;
		}
		
		public void BFS(int val,int k,List<Integer>ll) {
			Queue<Pair> q=new LinkedList<>();
			HashSet<Integer>visited=new HashSet<>();
			q.add(new Pair(val,0));
			while(!q.isEmpty()) {
				Pair rv = q.poll();
				if(visited.contains(rv.vtx)) {
					continue;
				}
				visited.add(rv.vtx);
				if(rv.dis==k) {
					ll.add(rv.vtx);
                    // continue;
				}
				for(int nbrs:hm.get(rv.vtx)) {
					if(!visited.contains(nbrs)) {
						q.add(new Pair(nbrs,rv.dis+1));
					}
				}
			}
		}
		
		public void graph(TreeNode root,HashMap<Integer,List<Integer>> hm){
			if(root==null) {
				return;
			}
			if(!hm.containsKey(root.val)) {
				hm.put(root.val, new ArrayList<Integer>());
			}
			if(root.left!=null) {
				hm.get(root.val).add(root.left.val);
				hm.put(root.left.val, new ArrayList<Integer>());
				hm.get(root.left.val).add(root.val);
			}
			if(root.right!=null) {
				hm.get(root.val).add(root.right.val);
				hm.put(root.right.val, new ArrayList<Integer>());
				hm.get(root.right.val).add(root.val);
			}
			graph(root.left,hm);
			graph(root.right,hm);
			
		}
}
public class Pair{
		int vtx;
		int dis;
		
		public Pair(int vtx,int dis) {
			this.vtx=vtx;
			this.dis=dis;
		}
	}