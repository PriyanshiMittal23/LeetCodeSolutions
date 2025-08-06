// Last updated: 6/8/2025, 11:11:03 pm
class Solution {
    public int change(int amount, int[] coins) {
        int[][]dp=new int[amount+1][coins.length];
        for(int[]a:dp){
            Arrays.fill(a,-1);
        }
        return coin(amount,coins,0,dp);
    }

    public int coin(int n,int[]c,int i,int[][]dp){
        if(i>=c.length){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(dp[n][i]!=-1){
            return dp[n][i];
        }
        int inc=0;
        int exc=0;
        if(n>=c[i]){
            inc=coin(n-c[i],c,i,dp);
        }
        exc=coin(n,c,i+1,dp);
        return dp[n][i]=inc+exc;

    }
}