// Last updated: 6/8/2025, 11:11:48 pm
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int a:nums){
            hm.put(a,hm.getOrDefault(a,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>>pq=new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            pq.add(e);
        }
        int[]ans=new int[k];
        int a=0;
        while(a<k){
            ans[a++]=pq.poll().getKey();
        }
        return ans;
    }
}