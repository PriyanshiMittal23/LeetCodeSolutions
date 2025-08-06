// Last updated: 6/8/2025, 11:14:22 pm
class Solution {
    public int minDistance(String word1, String word2) {
        int[][]dp=new int[word1.length()][word2.length()];
		for(int[]a:dp) {
			Arrays.fill(a, -1);
		}
		return edist(word1,word2,0,0,dp);
        
    }
    public static int edist(String s1,String s2, int i,int j,int[][]dp) {
		if(i==s1.length()){
            return s2.length()-j;
        }
        if(j==s2.length()){
            return s1.length()-i;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int n=0;
        if(s1.charAt(i)==s2.charAt(j)){
            n=edist(s1,s2,i+1,j+1,dp);
        }
        else{
            int in=edist(s1,s2,i,j+1,dp);
            int de=edist(s1,s2,i+1,j,dp);
            int re=edist(s1,s2,i+1,j+1,dp);
            n =Math.min(in,Math.min(de,re))+1;
        }
        return dp[i][j]=n;
	}
}