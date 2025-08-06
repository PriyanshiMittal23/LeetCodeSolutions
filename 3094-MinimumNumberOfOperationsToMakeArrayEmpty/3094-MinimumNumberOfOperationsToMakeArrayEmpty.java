// Last updated: 6/8/2025, 11:05:44 pm
class Solution {
    public int minOperations(int[] nums) {
        int c = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            int v = e.getValue();
            if(v==1){
                return -1;
            }
            c+= v/3;
            if(v%3!=0){
                c++;
            }
        }
        return c;
    }
}