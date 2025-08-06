// Last updated: 6/8/2025, 11:09:42 pm
class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-1;i>1;i--){
            if(nums[i-1]+nums[i-2]>nums[i]){
                        return nums[i-1]+nums[i]+nums[i-2];
            }
        }
        return 0;
    }
}