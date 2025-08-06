// Last updated: 6/8/2025, 11:06:26 pm
class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int[]ans=new int[nums.length];
        int []right=new int[nums.length];
        int[]left=new int[nums.length];
        for(int a=1;a<nums.length;a++){
            left[a]=left[a-1]+nums[a-1];
        }
        for(int b=nums.length-2;b>=0;b--){
            right[b]=right[b+1]+nums[b+1];
        }
        for(int c=0;c<nums.length;c++){
            ans[c]=Math.abs(left[c]-right[c]);
        }
        return ans;
    }
}