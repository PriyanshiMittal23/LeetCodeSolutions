// Last updated: 6/8/2025, 11:08:01 pm
class Solution {
    public int subsetXORSum(int[] nums) {
        return subset(nums, 0, 0);
    }

    public int subset(int[]arr, int idx, int ans){
        if(idx >= arr.length){
            return ans;
        }

        int inc = subset(arr, idx+1, (ans^arr[idx]));
        int exc = subset(arr, idx+1, ans);
        return inc+exc;
    }
}