// Last updated: 6/8/2025, 11:05:09 pm
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int in=1;
        int dec=1;
        int ans=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                in++;
                ans=Math.max(ans,in);
                dec=1;
            }
            else if(nums[i]<nums[i-1]){
                dec++;
                ans=Math.max(ans,dec);
                in=1;
            }
            else{
                in=1;
                dec=1;
            }
        }
        return ans;
    }
}