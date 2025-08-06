// Last updated: 6/8/2025, 11:04:47 pm
class Solution {
    public int minOperations(int[] nums, int k) {
        HashSet<Integer> hs = new HashSet<>();
        for(int a: nums){
            if(a<k){
                return -1;
            }
            hs.add(a);
        }
        return hs.contains(k)? hs.size()-1 : hs.size();
    }
}