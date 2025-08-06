// Last updated: 6/8/2025, 11:07:28 pm
class Solution {
    public long mostPoints(int[][] questions) {
        // long[]arr=new long[questions.length];
        // for(int i=0;i<questions.length;i++){
        //     for(int j=i;j<questions.length;j=j+3){
        //         arr[i]=(long)(arr[i]+questions[j][1]);
        //     }
        // }
        // long ans=0;
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        //     ans=Math.max(arr[i],ans);
        // }
        long[]dp = new long[questions.length];
        return maxPoints(questions, 0, dp);
    }

    public long maxPoints(int[][]arr, int idx, long[]dp){
        if(idx>= arr.length){
            return 0;
        }
        if(dp[idx]>0){
            return dp[idx];
        }
        long inc = arr[idx][0] + maxPoints(arr, idx+arr[idx][1]+1, dp);
        long exc = maxPoints(arr, idx+1, dp);
        return dp[idx] = Math.max(inc, exc);
    }
}