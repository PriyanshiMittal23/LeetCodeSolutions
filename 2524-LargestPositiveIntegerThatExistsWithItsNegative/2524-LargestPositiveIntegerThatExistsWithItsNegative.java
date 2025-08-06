// Last updated: 6/8/2025, 11:07:05 pm
class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        int ans=0;
        for(int a:nums){
            if(hs.contains(-a)){
                ans=Math.max(ans, Math.abs(a));
            }
            hs.add(a);
        }
        return ans!=0?ans:-1;
    }
}