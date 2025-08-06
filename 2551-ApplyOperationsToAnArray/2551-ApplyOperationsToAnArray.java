// Last updated: 6/8/2025, 11:07:01 pm
class Solution {
    public int[] applyOperations(int[] nums) {
        int a = 0;
        while(a<nums.length-1){
            if(nums[a]!=0 && nums[a]==nums[a+1]){
                nums[a+1] = 0;
                nums[a] *= 2;
                a++;
            }
            a++;
        }
        int[]ans = new int[nums.length];
        int b = 0;
        for(int p : nums){
            if(p!=0){
                ans[b++]=p;
            }
        }
        return ans;
    }
}