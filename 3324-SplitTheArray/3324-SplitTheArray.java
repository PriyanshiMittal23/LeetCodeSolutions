// Last updated: 6/8/2025, 11:05:18 pm
class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int a:nums){
            hm.put(a,hm.getOrDefault(a,0)+1);
        }
        for(int a:hm.keySet()){
            int p=hm.get(a);
            if(p>2){
                return false;
            }
        }
        return true;
    }
}