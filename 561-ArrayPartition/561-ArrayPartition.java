// Last updated: 6/8/2025, 11:10:56 pm
class Solution {
    public int arrayPairSum(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i=i+2){
            ans=ans+nums[i];
        }
        return ans;
        
    }
}