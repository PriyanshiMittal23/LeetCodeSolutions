// Last updated: 6/8/2025, 11:05:29 pm
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int a:nums){
            hm.put(a,hm.getOrDefault(a,0)+1);
        }
        int mf=0;
        int ans=0;
        for(int v:hm.values()){
            mf=Math.max(mf,v);
        }
        for(int v:hm.values()){
            if(v==mf){
                ans+=mf;
            }
        }
        return ans;
    }
}