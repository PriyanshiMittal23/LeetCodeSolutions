// Last updated: 6/8/2025, 11:10:14 pm
class Solution {
    public boolean isBipartite(int[][] graph) {
        HashMap<Integer,HashMap<Integer,Integer>> hm = new HashMap<>();
        for(int i=0;i<graph.length;i++){
            hm.put(i,new HashMap<>());
        }
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
                hm.get(i).put(graph[i][j],0);
            }
        }
        return BFT(hm);

    }

    public boolean BFT(HashMap<Integer,HashMap<Integer,Integer>> hm){
        Queue<Pair> q = new LinkedList<>();
        HashMap<Integer,Integer> visited = new HashMap<>();
        for(int src : hm.keySet()){
            if(visited.containsKey(src)){
                continue;
            }
            Pair p = new Pair(src,0);
            q.add(p);
            while(!q.isEmpty()){
                Pair rv = q.poll();
                if(visited.containsKey(rv.val) && rv.dis!=visited.get(rv.val)){
                    return false;
                }
                visited.put(rv.val,rv.dis);
                for(int nbrs: hm.get(rv.val).keySet()){
                    if(!visited.containsKey(nbrs)){
                        Pair v = new Pair(nbrs,rv.dis+1);
                        q.add(v);
                    }
                }
            }
        }
        return true;
    }

    class Pair{
        int val;
        int dis;

        public Pair(int val, int dis){
            this.val=val;
            this.dis=dis;
        }
    }
}