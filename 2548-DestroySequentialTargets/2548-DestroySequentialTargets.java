// Last updated: 6/8/2025, 11:07:02 pm
class Solution {
    public int destroyTargets(int[] nums, int space) {
        TreeMap<Integer,Integer>hm = new TreeMap<>();
        for(int a:nums){
            int r = a%space;
            hm.put(r,hm.getOrDefault(r,0)+1);
        }
        int max = Collections.max(hm.values());
        Arrays.sort(nums);
        for(int a:nums){
            if(hm.get(a%space)==max){
                return a;
            }
        }
        return nums[0];
        
    }
}