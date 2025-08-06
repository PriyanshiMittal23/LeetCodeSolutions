// Last updated: 6/8/2025, 11:10:58 pm
class Solution {
    public int findCircleNum(int[][] isConnected) {
        HashMap<Integer,List<Integer>>hm = new HashMap<>();
        for(int i=1;i<=isConnected.length;i++){
            hm.put(i,new ArrayList<>());
        }
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[i].length;j++){
                if(isConnected[i][j]==1 && i!=j){
                    hm.get(i+1).add(j+1);
                }
            }
        }
        return NoOfComp(hm);
    }

    public int NoOfComp(HashMap<Integer,List<Integer>>hm){
        int c=0;
        Queue<Integer>q = new LinkedList<>();
        HashSet<Integer>visited = new HashSet<>();
        for(int a:hm.keySet()){
            if(visited.contains(a)){
                continue;
            }
            c++;
            q.add(a);
            while(!q.isEmpty()){
                int rv = q.poll();
                if(visited.contains(rv)){
                    continue;
                }
                visited.add(rv);
                for(int nbrs:hm.get(rv)){
                    if(!visited.contains(nbrs)){
                        q.add(nbrs);
                    }
                }
            }
        }
        return c;
    }
}