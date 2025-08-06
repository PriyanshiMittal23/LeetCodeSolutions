// Last updated: 6/8/2025, 11:12:31 pm
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],i);
            }else{
                int j=hm.get(nums[i]);
                if(i-j<=k){
                    return true;
                }
                else{
                    hm.put(nums[i],i);
                }
            }
        }
        return false;
    }
}