// Last updated: 6/8/2025, 11:09:53 pm
class Solution {
    public int knightDialer(int n) {
        int ans=0;
		int[][][]dp=new int[n][3][4];
		for(int[][]a:dp) {
			for(int[]b:a) {
				Arrays.fill(b, -1);
			}
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				ans=(ans+Count(n-1,j,i,dp))%1000000007;
			}
		}
		
		return ans;
    }
    public static int Count(int n,int cc,int cr,int[][][]dp) {
		if(cr<0 || cc<0 || cr>=4 || cc>=3 || (cr==3 && (cc==0 || cc==2))) {
			return 0;
		}
		if(n==0) {
			return 1;
		}
		if(dp[n][cc][cr]!=-1) {
			return dp[n][cc][cr];
		}
		int[]r= {-2,-2,2,2,1,1,-1,-1};
		int[]c= {-1,1,-1,1,-2,2,-2,2};
		int ans=0;
		for(int i=0;i<c.length;i++) {
			ans=(ans+Count(n-1,cc+c[i],cr+r[i],dp))%1000000007;
		}
		return dp[n][cc][cr]=ans%1000000007;
	}
}