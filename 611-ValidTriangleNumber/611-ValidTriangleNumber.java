// Last updated: 6/8/2025, 11:10:42 pm
class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for(int i=nums.length-1;i>=0;i--){
            int l = 0;
            int r = i-1;
            while(l<r){
                if(nums[l]+nums[r]> nums[i]){
                ans+=(r-l);
                r--;
                }else{
                    l++;
                }
            }
        }
        return ans;
    }
}