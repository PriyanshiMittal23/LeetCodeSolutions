// Last updated: 6/8/2025, 11:05:31 pm
class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int[][]ans = new int[nums.length/3][3];
        Arrays.sort(nums);
        int a=0;
        for(int i=0;i<nums.length-2;i+=3){
            if(nums[i+2]-nums[i]<=k){
                ans[a][0]=nums[i];
                ans[a][1]=nums[i+1];
                ans[a][2]=nums[i+2];
                a++;
            }
            else{
                return new int[0][0];

            }
        }
        return ans;
    }
}