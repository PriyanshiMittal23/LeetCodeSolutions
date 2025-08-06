// Last updated: 6/8/2025, 11:05:43 pm
class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxAns = 0;
        long maxDiff = 0;
        long maxEle = 0;
        for(int a : nums){
            maxAns = Math.max(maxDiff*a, maxAns);
            maxDiff = Math.max(maxEle-a, maxDiff);
            maxEle = Math.max(maxEle, a);
        }

        return maxAns;
    }
}