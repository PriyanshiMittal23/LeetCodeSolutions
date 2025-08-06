// Last updated: 6/8/2025, 11:07:48 pm
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        HashMap<Integer,List<Integer>> hm = new HashMap<>();
        for(int i=0;i<edges.length;i++){
            int a = edges[i][0];
            int b = edges[i][1];
            if(hm.containsKey(a)){
                hm.get(a).add(b);
            }else{
                hm.put(a,new ArrayList<Integer>());
                hm.get(a).add(b);
            }
            if(hm.containsKey(b)){
                hm.get(b).add(a);
            }else{
                hm.put(b,new ArrayList<Integer>());
                hm.get(b).add(a);
            }
        }
        Queue<Integer>q = new LinkedList<>();
        HashSet<Integer>visited = new HashSet<>();
        q.add(source);
        while(!q.isEmpty()){
            int rv = q.poll();
            if(visited.contains(rv)){
                continue;
            }
            visited.add(rv);
            if(rv==destination){
                return true;
            }
            for(int nbrs:hm.get(rv)){
                if(!visited.contains(nbrs)){
                    q.add(nbrs);
                }
            }
        }
        return false;
    }
}