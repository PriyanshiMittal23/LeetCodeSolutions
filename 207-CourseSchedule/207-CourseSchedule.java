// Last updated: 6/8/2025, 11:12:41 pm
class Solution {
	    public boolean canFinish(int numCourses, int[][] prerequisites) {
	    	HashMap<Integer, List<Integer>> map = new HashMap<>();
	        for(int i=0;i<numCourses;i++) {
				map.put(i, new ArrayList<>());
			}
	        for(int i=0;i<prerequisites.length;i++){
	            int v1 = prerequisites[i][0];
	            int v2 = prerequisites[i][1];
	            map.get(v2).add(v1);
	        }
	        return hasCycle(map);
	    }
	    public int[] inDegree(HashMap<Integer, List<Integer>> map) {
			int[]arr = new int[map.size()];
			for(int key : map.keySet()) {
				for(int nbrs : map.get(key)) {
					arr[nbrs]++;
				}
			}
			return arr;
		}

		public boolean hasCycle(HashMap<Integer, List<Integer>> map) {
			int [] in = inDegree(map);
			Queue<Integer> q = new LinkedList<>();
			for(int i=0;i< in.length;i++) {
				if(in[i]==0) {
					q.add(i);
				}
			}
			int c=0;
			while(!q.isEmpty()) {
				int v = q.poll();
				c++;
				for(int nbrs : map.get(v)) {
					in[nbrs]--;
					if(in[nbrs]==0) {
						q.add(nbrs);
					}
				}
				
			}
			return c == map.size();
		}
	}
