// Last updated: 11/1/2026, 3:37:39 pm
1class Solution {
2    public int minimumDeleteSum(String s1, String s2) {
3        int ts = 0;
4        for(char c: s1.toCharArray()){
5            ts+= (int)(c);
6        }
7        for(char c:s2.toCharArray()){
8            ts+= (int)(c);
9        }
10        int [][]dp = new int[s1.length()][s2.length()];
11        for(int i=0;i<s1.length();i++){
12            for(int j=0;j<s2.length();j++){
13                if(s1.charAt(i)==s2.charAt(j)){
14                    int c = 0;
15                    if(i-1>=0 && j-1>=0){
16                        c = dp[i-1][j-1];
17                    }
18                    dp[i][j] = c + (int)(s1.charAt(i));
19                }else{
20                    int x = 0;
21                    int y = 0;
22                    if(i-1>=0){
23                        x = dp[i-1][j];
24                    }
25                    if(j-1>=0){
26                        y = dp[i][j-1];
27                    }
28                    dp[i][j] = Math.max(x,y);
29                }
30            }
31        }
32        return ts- 2*dp[s1.length()-1][s2.length()-1];
33    }
34}