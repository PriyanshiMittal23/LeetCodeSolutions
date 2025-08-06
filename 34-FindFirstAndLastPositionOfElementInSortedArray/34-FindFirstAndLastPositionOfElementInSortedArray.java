// Last updated: 6/8/2025, 11:15:03 pm
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a =0;
        int b=nums.length-1;
        int[]ans={-1,-1};
        while(a<nums.length && nums[a]!=target){
            a++;
        }
        while(b>=0 && nums[b]!=target){
            b--;
        }
        if(b>=0){
            ans[0]=a;
            ans[1]=b;
        }
        return ans;
    }
}