// Last updated: 31/10/2025, 10:18:25 pm
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[]ans = new int[2];
        int idx=0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i:nums){
            if(hs.contains(i)){
                ans[idx++]=i;
            }else{
                hs.add(i);
            }
        }
        return ans;
    }
}