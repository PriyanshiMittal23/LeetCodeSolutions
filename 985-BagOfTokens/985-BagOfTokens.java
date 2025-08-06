// Last updated: 6/8/2025, 11:09:48 pm
class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int ans=0;
        int mx=0;
        Arrays.sort(tokens);
        int a=0;
        int b=tokens.length-1;
        while(a<=b){
            if(power>=tokens[a]){
                power-=tokens[a++];
                // a++;
                ans++;
                mx=Math.max(ans,mx);
            }
            else if(ans>0){
                power+=tokens[b--];
                ans--;
            }
            else{
                break;
            }
        }
        return mx;
    }
}