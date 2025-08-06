// Last updated: 6/8/2025, 11:10:36 pm
class Solution {
    public int[] findErrorNums(int[] nums) {
        int d =0;
        int m =0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 1;i<=nums.length;i++){
            hm.put(i,2);
        }
        for(int a : nums){
            hm.put(a,hm.get(a)-1);
        }
        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            if (e.getValue() == 0) {
                d = e.getKey();
            }
            if (e.getValue() == 2) {
                m = e.getKey();
            }
        }
        return new int[]{d, m};
    }
}