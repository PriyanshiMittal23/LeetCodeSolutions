// Last updated: 6/8/2025, 11:09:24 pm
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int [][] dp= new int[text1.length()][text2.length()];
		for(int[]a:dp) {
			Arrays.fill(a, -1);
		}
		return (lcs(text1,text2,0,0,dp));
        // return lcs_bu(text1,text2);
        
    }
    public static int lcs(String s1, String s2, int i, int j,int[][]dp) {
		if(i==s1.length()||j==s2.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans=0;
        if(s1.charAt(i)==s2.charAt(j)){
            ans=1+lcs(s1,s2,i+1,j+1,dp);
        }
        else{
            int fs=lcs(s1,s2,i+1,j,dp);
            int ss=lcs(s1,s2,i,j+1,dp);
            ans=Math.max(fs,ss);
        }
        return dp[i][j]=ans;
	}
    public static int lcs_bu(String s1,String s2) {
		int[][]dp=new int[s1.length()+1][s2.length()+1];
		for(int i=1;i<dp.length;i++) {
			for(int j=1;j<dp[0].length;j++) {
				int ans=0;
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					ans=1+dp[i-1][j-1];
				}
				else {
					int fs=dp[i-1][j];
					int ss=dp[i][j-1];
					ans=Math.max(fs, ss);
				}
				dp[i][j]=ans;
			}
			
		}
		return dp[dp.length-1][dp[0].length-1];
	}
}