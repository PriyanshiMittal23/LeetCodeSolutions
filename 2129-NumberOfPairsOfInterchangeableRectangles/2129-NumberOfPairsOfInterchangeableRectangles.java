// Last updated: 6/8/2025, 11:07:45 pm
class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double, Integer> hm = new HashMap<>();
        for(int[]a:rectangles){
            double ratio = (double)(a[0]/(a[1]*1.0));
            hm.put(ratio,(hm.getOrDefault(ratio,0)+1));
        }
        long ans = 0;
        System.out.println(hm);
        for(Map.Entry<Double,Integer>e:hm.entrySet()){
            ans+=sum(e.getValue());
        }
        return ans;
    }

    public long sum(int a){
        long ans=0;
        for(int i=a-1;i>=1;i--){
            ans+=i;
        }
        return ans;
    }
}