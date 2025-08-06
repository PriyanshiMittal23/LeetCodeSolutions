// Last updated: 6/8/2025, 11:15:31 pm
class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        boolean[][]dp=new boolean[n][n];
        int st=0;
        int e=0;
        int ans=0;
        for(int i=0;i<n;i++){
            dp[i][i]=true;
            for(int j=0;j<i;j++){
                if(s.charAt(i)==s.charAt(j) && (i-j<=2 || dp[j+1][i-1])){
                    dp[j][i]=true;
                    if(i-j+1>ans){
                        ans=i-j+1;
                        st=j;
                        e=i;
                    }
                }
            }
        }
        return s.substring(st,e+1);
    }
}