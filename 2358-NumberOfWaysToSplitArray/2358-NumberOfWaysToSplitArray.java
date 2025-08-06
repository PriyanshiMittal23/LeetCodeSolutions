// Last updated: 6/8/2025, 11:07:24 pm
class Solution {
    public int waysToSplitArray(int[] nums) {
        long[] as = new long[nums.length-1];
        long[] bs = new long[nums.length-1];
        as[0]=nums[0];
        bs[bs.length-1]=nums[bs.length];
        for(int i=1;i<as.length;i++){
            as[i]=as[i-1]+nums[i];
        }
        for(int i=bs.length-2;i>=0;i--){
            bs[i] = nums[i+1]+bs[i+1];
        }
        int c =0;
        for(int i=0;i<as.length;i++){
            if(as[i]>=bs[i]){
                c++;
            }
        }
        return c;
    }
}