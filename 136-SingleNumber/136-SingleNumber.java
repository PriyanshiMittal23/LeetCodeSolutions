// Last updated: 6/8/2025, 11:13:25 pm
class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int a : nums){
            ans = (ans ^ a);
        }
        return ans;
    }
}