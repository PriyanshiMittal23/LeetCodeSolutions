// Last updated: 6/8/2025, 11:09:11 pm
class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(i,new HashMap<>());
        }
        for(int i=0;i<edges.length;i++){
            int v1=edges[i][0];
            int v2=edges[i][1];
            hm.get(v1).put(v2,succProb[i]);
            hm.get(v2).put(v1,succProb[i]);
        }
        System.out.println(hm);
        PriorityQueue<double[]> pq = new PriorityQueue<>(Comparator.comparingDouble(a -> -a[0]));
        double[] prob = new double[n];
        pq.offer(new double[]{1, start_node});
        while (!pq.isEmpty()) {
            double[] cur = pq.poll();
            int v = (int)cur[1];
            if (v == end_node) {
                return cur[0];
            }
            if (cur[0] > prob[v]) {
                prob[v] = cur[0];
                for (Map.Entry<Integer, Double> entry : hm.getOrDefault(v, new HashMap<>()).entrySet()) {
                    int nb = entry.getKey();
                    double p = entry.getValue();
                    pq.offer(new double[]{cur[0] * p, nb});
                }
            }
        }
        return 0d;
    }

    HashMap<Integer,HashMap<Integer,Double>> hm;
}